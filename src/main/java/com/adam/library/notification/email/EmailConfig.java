package com.adam.library.notification.email;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Configuration
@Slf4j
public class EmailConfig {

    @Component
    public class EmailServiceImpl implements EmailService {

        private JavaMailSender mailSender;

        @Autowired
        public EmailServiceImpl(JavaMailSender mailSender) {
            this.mailSender = mailSender;
        }


        public void sendSimpleMessage(EmailNotification emailNotification) {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(emailNotification.getToAddress().toArray(new String[0]));//TODO: OPtimize and make it comma seperated string
            message.setSubject(emailNotification.getSubject());
            message.setText(emailNotification.getBody());
            mailSender.send(message);

        }


        public void sendMessageWithAttachment(EmailNotification emailNotification, String contentType) throws MailException {
            MimeMessage message = mailSender.createMimeMessage();
            try {
                MimeMessageHelper helper = new MimeMessageHelper(message, false, "utf-8");
                helper.setTo(emailNotification.getToAddress().toArray(new String[0]));
                helper.setSubject(emailNotification.getSubject());
                message.setFrom(emailNotification.getFromAddress());
                message.setContent(emailNotification.getBody(), contentType);
            } catch(MessagingException me) {
                log.error("MessagingException: Error trying to send {} email.", contentType, me);
            }
            mailSender.send(message);

            log.debug("sent email....");
        }

    }

}

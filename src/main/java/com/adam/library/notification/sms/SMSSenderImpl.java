package com.adam.library.notification.sms;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SMSSenderImpl implements SMSSender{

    @Value("${twilio.sid}")
    private String ACCOUNT_SID;

    @Value("${twilio.token}")
    private String AUTH_TOKEN;

    @Value("${twilio.number}")
    private String TWILIO_NUMBER;

    @Override
    public void send(SMSNotification smsNotification) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message
                .creator(new PhoneNumber(smsNotification.getPhoneNumber()), // to
                        new PhoneNumber(TWILIO_NUMBER), // from
                        smsNotification.getMessage())
                .create();
        log.debug("SMS Constructed with to number: " + smsNotification.getPhoneNumber() + " with message content: " + smsNotification.getMessage());
        log.debug("Message sent with SID: " + message.getSid());
    }
}

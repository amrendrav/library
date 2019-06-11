package com.adam.library.notification.email;

public interface EmailService {

    void sendSimpleMessage(EmailNotification emailNotification);
    void sendMessageWithAttachment(EmailNotification emailNotification, String contentType);
}

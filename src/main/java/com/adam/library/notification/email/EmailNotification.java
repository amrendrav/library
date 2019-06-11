package com.adam.library.notification.email;

import java.util.List;

public class EmailNotification {

    private String fromAddress;

    private List<String> toAddress;

    private String subject;

    private String body;

    public EmailNotification() {
        // empty ctor
    }

    public EmailNotification(String fromAddress, List<String> toAddress, String subject, String body) {
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.subject = subject;
        this.body = body;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public List<String> getToAddress() {
        return toAddress;
    }

    public void setToAddress(List<String> toAddress) {
        this.toAddress = toAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

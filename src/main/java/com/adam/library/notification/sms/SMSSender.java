package com.adam.library.notification.sms;

import com.twilio.exception.TwilioException;

public interface SMSSender {

    void send(SMSNotification smsNotification) throws TwilioException;
}

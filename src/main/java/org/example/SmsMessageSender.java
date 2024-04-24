package org.example;

public class SmsMessageSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sms :"+ message);
    }
}

package org.example;

public class LongMessage {
    MessageSender emailSender;

    public LongMessage(MessageSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendLongMessage(String m) {
        if (m.length() > 50) {
            emailSender.sendMessage(m);
        }
    }
}

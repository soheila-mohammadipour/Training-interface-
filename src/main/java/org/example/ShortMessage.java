package org.example;

public class ShortMessage {
    MessageSender smsSender;

    public ShortMessage(MessageSender smsSender) {
        this.smsSender =smsSender;
    }

    public void sendShortMessage(String m) {
        if (m.length() < 50) {
            smsSender.sendMessage(m);
        }
    }
}
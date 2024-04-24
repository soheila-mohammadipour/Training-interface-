package org.example;

public class EmailmessageSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email :"+ message);

    }
}

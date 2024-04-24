package org.example;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.ShortMessage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidMidiDataException {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Your Message :");
        String message=scanner.nextLine();

        System.out.println("enter your Message Type (1 or 2):");
        int type=scanner.nextInt();

       if(type==1){
           
           MessageSender sender=new EmailmessageSender();
           LongMessage longMessage=new LongMessage(sender);
           longMessage.sendLongMessage(message);
           sender.sendMessage(message);
           System.out.println("Your Message has been sent .");


       }else if(type==2){
           MessageSender sender= new SmsMessageSender();
           ShortMessage shortMessage =new ShortMessage(sender);
           shortMessage.setMessage(message);
           
           System.out.println("Your Message has been sent .");
            }
    }
}
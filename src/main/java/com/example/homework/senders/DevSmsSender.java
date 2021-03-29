package com.example.homework.senders;



public class DevSmsSender implements SmsSender{

    @Override
    public void send(String phoneNumber, String text) {
        System.out.println("profile: dev");
        System.out.println("Номер телефона: "+phoneNumber );
        System.out.println("Сообщение: "+text );

    }
}

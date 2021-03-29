package com.example.homework.senders;


public class ProdSmsSender implements SmsSender {

    @Override
    public void send(String phoneNumber, String text) {
        System.out.println("profile: test or prod");
        System.out.println("Номер телефона: "+phoneNumber );
        System.out.println("Сообщение: "+text );
    }
}

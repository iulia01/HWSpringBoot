package com.example.homework.senders;

public interface SmsSender {
    void send(String phoneNumber, String text);
}

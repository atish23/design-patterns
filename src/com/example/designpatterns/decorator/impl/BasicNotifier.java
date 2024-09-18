package com.example.designpatterns.decorator.impl;

import com.example.designpatterns.decorator.base.Notifier;

public class BasicNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending message: " + message);
    }
}

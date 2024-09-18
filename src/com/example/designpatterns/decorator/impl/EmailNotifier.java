package com.example.designpatterns.decorator.impl;

import com.example.designpatterns.decorator.base.Notifier;
import com.example.designpatterns.decorator.base.NotifierDecorator;

public class EmailNotifier extends NotifierDecorator {
    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending email: " + message);
    }
}

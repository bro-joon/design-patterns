package com.boksil2.observer;

import java.util.*;

public class ChatServer {

    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void register(String subject, Subscriber subscriber) {
        if(subscribers.containsKey(subject)) {
            subscribers.get(subject).add(subscriber);
        } else {
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            subscribers.put(subject, list);
        }
    }

    public void unregister(String subject, Subscriber subscriber) {
        if(subscribers.containsKey(subject)) {
            subscribers.get(subject).remove(subscriber);
        }
    }

    public void sendMessage(User user, String subject, String message) {
        if(subscribers.containsKey(subject)) {
            String userMessage = user.getName() + ": " + message;
            subscribers.get(subject).forEach(s -> s.handleMessage(userMessage));
        }
    }
}

package com.example.spring;

public class FrenchGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "Bonjour, " + name + "!";
    }
}

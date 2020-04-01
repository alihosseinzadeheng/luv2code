package com.luv2code.springdemo.demo;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "today is your lucky day! yayaya";
    }
}

package com.luv2code.springdemo.demo;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Pasar las trienta minutos";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

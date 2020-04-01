package com.luv2code.springdemo.demo;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;
    public TrackCoach(FortuneService theFortuneService) {
       fortuneService=theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Correr en 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: "+fortuneService.getFortune();
    }
}
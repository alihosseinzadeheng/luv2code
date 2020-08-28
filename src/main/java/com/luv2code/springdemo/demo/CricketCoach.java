package com.luv2code.springdemo.demo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String address;

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("This is Settter method babe! ");
        this.fortuneService = fortuneService;
    }

    public void setAddress(String address) {
        System.out.println("setter of Address is here! ");
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

  /*  public CricketCoach() {
        System.out.println("This is no-arg constructor babe! ");
    }*/

    @Override
    public String getDailyWorkout() {
        return "This is routine in cricket ";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

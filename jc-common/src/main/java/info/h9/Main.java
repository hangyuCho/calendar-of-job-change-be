package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @SpringBootApplication
    public static class CalendarOfJobChangeBeApplication {

        public static void main(String[] args) {
            SpringApplication.run(CalendarOfJobChangeBeApplication.class, args);
        }

    }
}
package com.example.demo.services;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calculator {
    LocalDate todaysDate = LocalDate.now();
    LocalDate enteringDate;

    public String dateCal(String dato) {
        enteringDate = LocalDate.parse(dato);
        int forskel = (int) ChronoUnit.DAYS.between(todaysDate, enteringDate);

        return "Antal dages forskel: " + forskel + " Mellem: " + todaysDate.getDayOfWeek() + " " + enteringDate.getDayOfWeek() + " " + enteringDate;
    }
}

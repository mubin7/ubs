package com.ubs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BerlinClockDemo {

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        BerlinClock berlinClock = new BerlinClock();
        String currentTime = dateFormat.format(date);
        System.out.println("current time : " + currentTime);
        berlinClock.setClockParts(currentTime);
        berlinClock.setTopRow();
        berlinClock.setHour();
        berlinClock.setMinute();
        berlinClock.displaySecond();
        berlinClock.displayHour();
        berlinClock.displayMinute();
    }
}

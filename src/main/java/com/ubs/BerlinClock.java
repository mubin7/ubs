package com.ubs;

import java.util.Arrays;

public class BerlinClock {

    private int hour;
    private int minute;
    private int second;
    private int[] topRow = new int[1];
    private int[] firstRowHour = new int[4];
    private int[] secondRowHour = new int[4];
    private int[] firstRowMinute = new int[11];
    private int[] secondRowMinute = new int[4];

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int[] getTopRow() {
        return topRow;
    }

    public int[] getFirstRowHour() {
        return firstRowHour;
    }

    public int[] getSecondRowHour() {
        return secondRowHour;
    }

    public int[] getFirstRowMinute() {
        return firstRowMinute;
    }

    public int[] getSecondRowMinute() {
        return secondRowMinute;
    }

    public void setClockParts(String time) {
        String[] timeParts = time.split(":");
        hour = Integer.valueOf(timeParts[0]);
        minute = Integer.valueOf(timeParts[1]);
        second = Integer.valueOf(timeParts[2]);
    }

    public void setTopRow() {
        topRow[0] = (second % 2 == 0 ? 0 : 1);
    }

    public void setHour() {
        int firstRowCount = hour / 5;
        int secondRowCount = hour % 5;

        for (int i = 0; i < firstRowCount; i++) {
            firstRowHour[i] = 1;
        }

        for (int i = 0; i < secondRowCount; i++) {
            secondRowHour[i] = 1;
        }
    }

    public void setMinute() {
        int firstRowCount = minute / 5;
        int secondRowCount = minute % 5;

        for (int i = 0; i < firstRowCount; i++) {
            firstRowMinute[i] = 1;
        }

        for (int i = 0; i < secondRowCount; i++) {
            secondRowMinute[i] = 1;
        }
    }

    public void displaySecond() {
        System.out.println("second : " + Arrays.toString(getTopRow()));
    }

    public void displayHour() {
        System.out.println("first hour row : " + Arrays.toString(getFirstRowHour()));
        System.out.println("second hour row : " + Arrays.toString(getSecondRowHour()));
    }

    public void displayMinute() {
        System.out.println("first hour row : " + Arrays.toString(getFirstRowMinute()));
        System.out.println("second hour row : " + Arrays.toString(getSecondRowMinute()));
    }
}
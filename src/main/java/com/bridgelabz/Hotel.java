package com.bridgelabz;

public class Hotel {
    /**
     * Hotel class has three fields :
     * Hotel name -> String data type hotel name
     * Week-day regular rate -> Charge for the hotel stay for the week days
     * Week-end regular rate -> charge for the hotel stay for the weekends
     */
    private String hotelName;
    private int weekDayRegularRate;
    private int weekEndRegularRate;

    /* Constructor for the corresponding fields is generated*/
    public Hotel(String hotelName, int weekDayRegularRate, int weekEndRegularRate) {
        this.hotelName = hotelName;
        this.weekDayRegularRate = weekDayRegularRate;
        this.weekEndRegularRate = weekEndRegularRate;
    }
    /*Getters and setters for the corresponding fields*/

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekDayRegularRate() {
        return weekDayRegularRate;
    }

    public void setWeekDayRegularRate(int weekDayRegularRate) {
        this.weekDayRegularRate = weekDayRegularRate;
    }

    public int getWeekEndRegularRate() {
        return weekEndRegularRate;
    }

    public void setWeekEndRegularRate(int weekEndRegularRate) {
        this.weekEndRegularRate = weekEndRegularRate;
    }
}

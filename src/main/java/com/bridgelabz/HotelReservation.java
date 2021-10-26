package com.bridgelabz;

public class HotelReservation {

    /* Welcome message -> Welcome to Hotel-Reservation program */
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel-reservation program");

    }

    /**
     * Method-description:
     * addHotel method -> Method to add hotels details with name and rates for regular customer.
     * hotelName-> Name of the hotel as first argument.
     * weekDayRegularRate->The charge for the hotel on weekdays as second argument.
     * weekEndRegularRate-> The charge for the hotel on weekends as third argument.
     * Returns -> Hotel name week day rates and weekend rates
     */
    public Hotel addHotel(String hotelName, int weekDayRegularRate, int weekEndRegularRate) {
        return new Hotel(hotelName, weekDayRegularRate, weekEndRegularRate);
    }


}

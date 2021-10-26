package com.bridgelabz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();
    Hotel hotel1 = hotelReservation.addHotel("LakeWood", 110, 90);
    Hotel hotel2 = hotelReservation.addHotel("BridgeWood", 150, 60);
    Hotel hotel3 = hotelReservation.addHotel("RidgeWood", 220, 150);

    /*Test aim -> To validate hotel names
     *The expected is compared with the actual
     */
    @Test
    public void forTheProvidedHotelDetails_whenAddedHotelName_ShouldReturnEnteredName() {
        assertEquals(hotel1.getHotelName(), "LakeWood");
        assertEquals(hotel2.getHotelName(), "BridgeWood");
        assertEquals(hotel3.getHotelName(), "RidgeWood");
    }

}

package com.goit.core.module05;

import java.util.Date;

/**
 * Created by Mala on 11/27/2016.
 */
public class TripAdvisorAPI implements API {
   static Room[] rooms=new Room[5];

    public TripAdvisorAPI() {
        Room quad = new Room(101,8000,4, new Date(),"HILTON ","KYIV");
        rooms[0] = quad;
        Room twin =new  Room(102,500,4, new Date(), "MIRRORS DESIGN HOTEL","KYIV");
        rooms[1]=twin;
        Room suit =new  Room(103,2500,5, new Date(),"FHYATT REGENCY","KYIV" );
        rooms[2]=suit;
        Room king =new  Room(104,1900,2, new Date(), "FOUR POINTS BY SHERATON ","ZAPOROZHYE");
        rooms[3]=king;
        Room lux =new  Room(105,10000,2, new Date(), "ASTORIA","LVIV");
        rooms[4]=lux;
    }

    @Override
    public Room[] findRooms(int price, int persons, String hotel , String city) {
        Room[] found = new Room[rooms.length];
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() <= price && (persons <= rooms[i].getPersons()) && ((city.equals(rooms[i].getCityName())) && (hotel.equals(rooms[i].getHotelName())))) {
                found[count] = rooms[i];
                count++;
            }
        }
        return found;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }
}

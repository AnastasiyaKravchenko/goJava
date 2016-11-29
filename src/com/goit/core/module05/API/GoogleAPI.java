package com.goit.core.module05.API;
import com.goit.core.module05.Entity.Room;
import java.util.Date;

/**
 * Created by Mala on 11/27/2016.
 */
public class GoogleAPI implements API {
    static private final Room[] rooms = new Room[5];

    static  {
        Room econom = new Room(201,250,2, new Date(),"CONTINENTAL","ODESSA");
        rooms[0] = econom;
        Room superLux =new  Room(202,15000,4, new Date(), "SWISS HOTEL","LVIV");
        rooms[1]=superLux;
        Room suit =new  Room(203,2500,5,new Date(),"FHYATT REGENCY","KYIV" );
        rooms[2]=suit;
        Room president =new  Room(204,20000,6, new Date(), "RADISSON BLU RESORT","BUKOVEL");
        rooms[3]=president;
        Room studio =new  Room(205,4000,2, new Date(), "INTERCONTINENTAL","KYIV");
        rooms[4]=studio;
    }

    @Override
    public Room[] findRooms(int price, int persons, String hotel, String city) {
        Room[] found = new Room[rooms.length];
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() <= price &&
                    (persons <= rooms[i].getPersons()) &&
                    ((city.equals(rooms[i].getCityName())) &&
                            (hotel.equals(rooms[i].getHotelName())))) {
                found[count] = rooms[i];
                count++;
            }
        }
        Room[] finalFound=new Room[count];
        if (count != 0)
            System.arraycopy(found, 0, finalFound, 0, finalFound.length);
        return finalFound;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }
}

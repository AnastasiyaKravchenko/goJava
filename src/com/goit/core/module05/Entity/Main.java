package com.goit.core.module05.Entity;

import com.goit.core.module05.API.API;
import com.goit.core.module05.API.BookingComAPI;
import com.goit.core.module05.API.TripAdvisorAPI;
import com.goit.core.module05.API.GoogleAPI;

/**
 * Created by Mala on 11/28/2016.
 */
public class Main {

    public static void showResult(Room[] room) {
        if (room != null) {
            for (Room result : room)
                System.out.println(result.getId() + " " +
                        result.getPrice() + " " +
                        result.getPersons() + " " +
                        result.getDateAvailableFrom() + " " +
                        result.getHotelName() + " " +
                        result.getCityName());
        } else
            System.out.println("NULL");
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        Room[] request1 = controller.requestRooms(200, 1, "LEOPOLIS HOTEL", "LVIV");
        Room[] request2 = controller.requestRooms(4000, 2, "INTERCONTINENTAL", "KYIV");
        Room[] request3 = controller.requestRooms(2500, 5, "FHYATT REGENCY", "KYIV");

        System.out.println("Request Rooms method: ");
        showResult(request1);
        showResult(request2);
        showResult(request3);

        API api1 = new BookingComAPI();
        API api2 = new TripAdvisorAPI();
        API api3 = new GoogleAPI();

        Room[] room1 = controller.check(api1, api2);
        Room[] room2 = controller.check(api1, api3);
        Room[] room3 = controller.check(api2, api3);

        System.out.println("Check method: ");
        showResult(room1);
        showResult(room2);
        showResult(room3);
    }
}

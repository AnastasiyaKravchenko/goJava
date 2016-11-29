package com.goit.core.module05;

import com.goit.core.module05.apis.Api;
import com.goit.core.module05.apis.BookingComApi;
import com.goit.core.module05.apis.GoogleApi;
import com.goit.core.module05.apis.TripAdvisorApi;
import com.goit.core.module05.controllers.Controller;
import com.goit.core.module05.entities.Room;

/**
 * Created by Mala on 11/28/2016.
 */
public class Main {

    private static void showResult(Room[] room) {
        if (room != null) {
            for (Room result : room) {
                System.out.println(result.getId() + " " +
                        result.getPrice() + " " +
                        result.getPersons() + " " +
                        result.getDateAvailableFrom() + " " +
                        result.getHotelName() + " " +
                        result.getCityName());
            }
        } else {
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        Room[] request1 = controller.requestRooms(200, 1, "LVIV", "LEOPOLIS HOTEL");
        Room[] request2 = controller.requestRooms(4000, 2, "KYIV", "INTERCONTINENTAL");
        Room[] request3 = controller.requestRooms(2500, 5, "KYIV", "FHYATT REGENCY");

        System.out.println("Request Rooms method: ");
        showResult(request1);
        showResult(request2);
        showResult(request3);

        Api api1 = new BookingComApi();
        Api api2 = new TripAdvisorApi();
        Api api3 = new GoogleApi();

        Room[] room1 = controller.check(api1, api2);
        Room[] room2 = controller.check(api1, api3);
        Room[] room3 = controller.check(api2, api3);

        System.out.println("Check method: ");
        showResult(room1);
        showResult(room2);
        showResult(room3);
    }
}

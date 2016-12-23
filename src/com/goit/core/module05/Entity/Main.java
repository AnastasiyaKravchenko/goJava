package com.goit.core.module05.Entity;

import com.goit.core.module05.API.API;
import com.goit.core.module05.API.BookingComAPI;
import com.goit.core.module05.API.GoogleAPI;
import com.goit.core.module05.API.TripAdvisorAPI;

/**
 * Created by Mala on 11/28/2016.
 */
public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        System.out.println("Request Rooms method: ");
        System.out.println(controller.requestRooms(200, 1, "LEOPOLIS HOTEL", "LVIV").toString());
        System.out.println(controller.requestRooms(4000, 2, "INTERCONTINENTAL", "KYIV").toString());
        System.out.println(controller.requestRooms(2500, 5, "FHYATT REGENCY", "KYIV").toString());


        API api1 = new BookingComAPI();
        API api2 = new TripAdvisorAPI();
        API api3 = new GoogleAPI();

        System.out.println("Check method: ");
        System.out.println(controller.check(api1, api2).toString());
        System.out.println(controller.check(api1, api3).toString());
        System.out.println(controller.check(api2, api3).toString());


    }
}

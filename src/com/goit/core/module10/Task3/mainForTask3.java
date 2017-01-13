package com.goit.core.module10.Task3;

/**
 * Created by Mala on 1/13/2017.
 */
public class mainForTask3 {
static String arg=null;

    public static void main(String[] args) {
        try {
            arg.toString();
        }catch (NullPointerException e){
            System.err.println("Catch NullPointerException ");
            System.out.println("Value of arg is: "+arg);
        }

    }
}

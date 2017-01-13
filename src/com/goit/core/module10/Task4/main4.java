package com.goit.core.module10.Task4;

/**
 * Created by Mala on 1/13/2017.
 */
public class main4 {
    public static void main(String[] args) {
       Test4 test4 =new Test4();
        try {
            test4.g();
        }catch (Throwable t){
            System.err.println("ERROR: " + t.getMessage());
        }
        try {
            test4.f();
        }catch (Throwable t){
            System.err.println("ERROR: " + t.getMessage());
        }
    }
}

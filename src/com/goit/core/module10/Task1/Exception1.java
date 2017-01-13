package com.goit.core.module10.Task1;

/**
 * Created by Mala on 1/12/2017.
 */
public class Exception1 extends Exception{
    public String arg;

    public Exception1(String arg) {
        this.arg = arg;
        System.out.println("Exception1");
    }
}


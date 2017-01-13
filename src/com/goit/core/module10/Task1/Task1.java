package com.goit.core.module10.Task1;

/**
 * Created by Mala on 1/12/2017.
 */
public class Task1 {
    static void func()throws Exception1 {
        throw new Exception1("From function()");
    }
    public static void main(String[] args) {
        try {
            func();
        }catch (Exception1 e){
            System.err.println("Catch Exception 1 ");
            e.getStackTrace();
        }finally {
            System.out.println("Finally block");
        }
    }
}

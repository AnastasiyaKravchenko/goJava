package com.goit.core.module10.Task5;

/**
 * Created by Mala on 1/13/2017.
 */
public class main5 {
    public static void main(String[] args) {
      Test5 test5=new Test5();
        try {
            test5.method();
        }catch (ExceptionABC e){
            System.out.println("Caught: "+e);
        }
    }
}

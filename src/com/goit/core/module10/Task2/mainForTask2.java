package com.goit.core.module10.Task2;

/**
 * Created by Mala on 1/13/2017.
 */
public class mainForTask2 {

    static void print(String a)throws MyException{
        System.out.println("Show value of input argument: "+a);
        throw new MyException(" Throwed new Exception");
    }

    public static void main(String[] args)  {
        try {
            print("aaa");
        }catch (MyException e){
            System.err.println("Error! "+e.getMessage());
        }
    }
}

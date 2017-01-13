package com.goit.core.module10.Task4;

/**
 * Created by Mala on 1/13/2017.
 */
public class Test4 {
    void f()throws TestClass2{
    try {
        System.out.println("g() from f()");
        g();
    }catch (TestClass e){
        System.out.println("From f() ");
        throw new TestClass2(10);
    }
    }
    void g()throws TestClass{
        throw new TestClass("From g()");
    }
}

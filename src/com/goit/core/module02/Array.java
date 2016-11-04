package com.goit.core.module02;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {

        int[] array ={21, 8, 12, 1, -6, 3, -4, 18, 25, 2 };
        double[] array1 ={2.5, 0.8, 5.12, -10.33, -6.8, 3.3, 71.14, -0.18, 9.221, 3.12 };
        System.out.println("--------int sum---------");
        sum(array);
        System.out.println("--------int min---------");
        min(array);
        System.out.println("--------int max---------");
        max(array);
        System.out.println("--------int maxPositive---------");
        maxPositive(array);
        System.out.println("--------int multiplication---------");
        multiplication(array);
        System.out.println("--------int modulus---------");
        modulus(array);
        System.out.println("--------int secondLargest---------");
        secondLargest(array);
        System.out.println("====================================");
        System.out.println("--------double sum---------");
        sum(array1);
        System.out.println("--------double min---------");
        min(array1);
        System.out.println("--------double max---------");
        max(array1);
        System.out.println("--------double maxPositive---------");
        maxPositive(array1);
        System.out.println("--------double multiplication---------");
        multiplication(array1);
        System.out.println("--------double modulus---------");
        modulus(array1);
        System.out.println("--------double secondLargest---------");
        secondLargest(array1);
    }

    //sum int
    static int sum(int[]array) {
       int count=0;
        int sum=0;

        while(count<array.length)
        {
           sum+=array[count];
           count++;
        }

        System.out.println(sum);
        return 0;
    }


    //min int
    static int min (int[]array) {
        int min= array[0];
        int count=0;
        while(count<array.length)
        {
            if(array[count]<min)
            min=array[count];

            count++;
        }

        System.out.println(min);
        return 0;
    }

    //max int
    static int max (int[]array) {
        int max= array[0];
        int count=0;
        while(count<array.length)
        {
            if(array[count]>max)
                max=array[count];

            count++;
        }

        System.out.println(max);
        return 0;
    }

    //maxPositive
    static int maxPositive (int[]array) {
        int max= array[0];
        int count=0;
        while(count<array.length)
        {
            if((array[count]>0)&&(array[count]>max))
                max=array[count];

            count++;
        }

        System.out.println(max);
        return 0;
    }

    //multiplication

    static int multiplication(int[]array) {
        int count=0;
        int mult=1;

        while(count<array.length)
        {
            mult*=array[count];
            count++;
        }

        System.out.println(mult);
        return 0;
    }

    //modulus of first and last element
    static int modulus(int[]array) {
        int mod=array[0]%array[9];
        System.out.println(mod);
        return 0;
    }

    //second largest element
    static int secondLargest (int[]array) {
        int max1= array[0];
        int max2= array[0];
        int count=0;
        while(count<array.length) {
            if(array[count]>max1)
                max1=array[count];

            count++;
        }

        while(count<array.length) {
            if((array[count]>max2)&&(array[count]<max1))
                max2=array[count];

            count++;
        }
        System.out.println(max2);
        return 0;
    }


    //====================DOUBLE=====================================


    //sum double
    static double sum(double[]array1) {
        int count=0;
        double sum=0;

        while(count<array1.length)
        {
            sum+=array1[count];
            count++;
        }

        System.out.println(sum);
        return 0;
    }


    //min double
    static double min (double[]array1) {
        double min= array1[0];
        int count=0;
        while(count<array1.length)
        {
            if(array1[count]<min)
                min=array1[count];

            count++;
        }

        System.out.println(min);
        return 0;
    }

    //max int
    static double max (double[]array1) {
        double max= array1[0];
        int count=0;
        while(count<array1.length)
        {
            if(array1[count]>max)
                max=array1[count];

            count++;
        }

        System.out.println(max);
        return 0;
    }

    //maxPositive double
    static double maxPositive (double[]array1) {
        double max= array1[0];
        int count=0;
        while(count<array1.length)
        {
            if((array1[count]>0)&&(array1[count]>max))
                max=array1[count];

            count++;
        }

        System.out.println(max);
        return 0;
    }

    //multiplication double

    static double multiplication(double[]array1) {
        int count=0;
        double mult=1;

        while(count<array1.length)
        {
            mult*=array1[count];
            count++;
        }

        System.out.println(mult);
        return 0;
    }

    //modulus of first and last element double
    static double modulus(double[]array1) {
        double mod=array1[0]%array1[9];
        System.out.println(mod);
        return 0;
    }

    //second largest element double
    static double secondLargest (double[]array1) {
        double max1= array1[0];
        double max2= array1[0];
        int count=0;
        while(count<array1.length) {
            if(array1[count]>max1)
                max1=array1[count];

            count++;
        }

        while(count<array1.length) {
            if((array1[count]>max2)&&(array1[count]<max1))
                max2=array1[count];

            count++;
        }
        System.out.println(max2);
        return 0;
    }
}


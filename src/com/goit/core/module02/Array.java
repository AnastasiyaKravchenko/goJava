package com.goit.core.module02;

import com.goit.core.module06.Arrays.ArraysUtils;

import java.util.Arrays;

//new commit
public class Array {
    public static void main(String[] args) {

        int[] array = {21, 8, 12, 1, -6, 3, -4, 18, 25, 2};
//        double[] array1 = {5.12, 0.8, 2.2, -10.33, -6.8, 3.3, 71.14, -0.18, -9.221, 3.12};
        System.out.println("--------int sum---------");
        System.out.println(ArraysUtils.sum(array));
        System.out.println("--------int min---------");
        System.out.println(ArraysUtils.min(array));
        System.out.println("--------int max---------");
        System.out.println(ArraysUtils.max(array));
        System.out.println("--------int maxPositive---------");
        System.out.println(ArraysUtils.maxPositive(array));
        System.out.println("--------int multiplication---------");
        System.out.println(ArraysUtils.multiplication(array));
        System.out.println("--------int modulus---------");
        System.out.println(ArraysUtils.modulus(array));
        System.out.println("--------int secondLargest---------");
        System.out.println(ArraysUtils.secondLargest(array));
        System.out.println("--------int reverse---------");
        System.out.println(Arrays.toString(ArraysUtils.reverse(array)));
        System.out.println("--------int even elements---------");
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(array)));

//        System.out.println("====================================");
//        System.out.println("--------double sum---------");
//        System.out.println(sum(array1));
//        System.out.println("--------double min---------");
//        System.out.println(min(array1));
//        System.out.println("--------double max---------");
//        System.out.println(max(array1));
//        System.out.println("--------double maxPositive---------");
//        System.out.println(maxPositive(array1));
//        System.out.println("--------double multiplication---------");
//        System.out.println(multiplication(array1));
//        System.out.println("--------double modulus---------");
//        System.out.println(modulus(array1));
//        System.out.println("--------double secondLargest---------");
//        System.out.println(secondLargest(array1));
    }
}
//    //sum int
//    static int sum(int[]array) {
//       int count=0;
//        int sum=0;
//
//        while(count<array.length)
//        {
//           sum+=array[count];
//           count++;
//        }
//
//
//        return sum;
//    }
//
//
//    //min int
//    static int min (int[]array) {
//        int min= array[0];
//        int count=0;
//        while(count<array.length)
//        {
//            if(array[count]<min)
//            min=array[count];
//
//            count++;
//        }
//
//        return min;
//    }
//
//    //max int
//    static int max (int[]array) {
//        int max= array[0];
//        int count=0;
//        while(count<array.length)
//        {
//            if(array[count]>max)
//                max=array[count];
//
//            count++;
//        }
//
//        return max;
//    }
//
//    //maxPositive
//    static int maxPositive (int[]array) {
//        int max= array[0];
//        int count=0;
//        while(count<array.length)
//        {
//            if((array[count]>0)&&(array[count]>max))
//                max=array[count];
//
//            count++;
//        }
//
//        return max;
//    }
//
//    //multiplication
//
//    static int multiplication(int[]array) {
//        int count=1;
//        int mult=1;
//
//        while(count<array.length)
//        {
//            mult*=array[count];
//            count++;
//        }
//
//        return mult;
//    }
//
//    //modulus of first and last element
//    static int modulus(int[]array) {
//        int mod=array[0]%array[array.length-1];
//        return mod;
//    }
//
//    //second largest element
//    static int secondLargest (int[]array) {
//        int max1= array[0];
//        int max2= array[0];
//        int count=0;
//        while(count<array.length) {
//            if(array[count]>max1)
//                max1=array[count];
//
//            count++;
//        }
//
//        while(count<array.length) {
//            if((array[count]>max2)&&(array[count]<max1))
//                max2=array[count];
//
//            count++;
//        }
//
//        return max2;
//    }
//
//
//    //====================DOUBLE=====================================
//
//
//    //sum double
//    static double sum(double[]array1) {
//        int count=0;
//        double sum=0;
//
//        while(count<array1.length)
//        {
//            sum+=array1[count];
//            count++;
//        }
//
//        return sum;
//    }
//
//
//    //min double
//    static double min (double[]array1) {
//        double min= array1[0];
//        int count=0;
//        while(count<array1.length)
//        {
//            if(array1[count]<min)
//                min=array1[count];
//
//            count++;
//        }
//
//        return min;
//    }
//
//    //max int
//    static double max (double[]array1) {
//        double max= array1[0];
//        int count=0;
//        while(count<array1.length)
//        {
//            if(array1[count]>max)
//                max=array1[count];
//
//            count++;
//        }
//
//        return max;
//    }
//
//    //maxPositive double
//    static double maxPositive (double[]array1) {
//        double max= array1[0];
//        int count=0;
//        while(count<array1.length)
//        {
//            if((array1[count]>0)&&(array1[count]>max))
//                max=array1[count];
//
//            count++;
//        }
//
//        return max;
//    }
//
//    //multiplication double
//
//    static double multiplication(double[]array1) {
//        int count=0;
//        double mult=1;
//
//        while(count<array1.length)
//        {
//            mult*=array1[count];
//            count++;
//        }
//
//        return mult;
//    }
//
//    //modulus of first and last element double
//    static double modulus(double[]array1) {
//        double mod=array1[0]%array1[array1.length-1];
//        return mod;
//    }
//
//    //second largest element double
//    static double secondLargest (double[]array1) {
//        double max1= array1[0];
//        double max2= array1[0];
//        int count=0;
//        while(count<array1.length) {
//            if(array1[count]>max1)
//                max1=array1[count];
//
//            count++;
//        }
//
//        while(count<array1.length) {
//            if((array1[count]>max2)&&(array1[count]<max1))
//                max2=array1[count];
//
//            count++;
//        }
//        return max2;
//    }
//}
//

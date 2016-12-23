package com.goit.core.module06.offline6;

import java.util.Arrays;
import java.util.Random;
//TASK#1    Заполнить массив рандомными числа,длинной 20, эти рандомные числа взять из промежтука между числами а и b

public class Array {

    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
            array[i] = random(10, 20);

        System.out.println(Arrays.toString(array));

    }

    static int random(int a, int b) {
        Random ran = new Random();
        int k = ran.nextInt(b - a+1) + a;
        return k;
    }
}

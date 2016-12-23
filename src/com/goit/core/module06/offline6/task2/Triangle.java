package com.goit.core.module06.offline6.task2;

/**
 * Created by Mala on 12/5/2016.
 */
public class Triangle extends View {
    int count = 0;

    @Override
    void show() {
        System.out.println("Show triangle ");
        count++;
    }

    @Override
    void hide() {
        if(count>0){
            for(int i=count;i>0;i--){
                System.out.println("Hide triangle");
            count--;}
        }
        else System.out.println("Triangle already shown");

    }
}

package com.goit.core.module06.offline6.task2;

/**
 * Created by Mala on 12/5/2016.
 */
public class Circle extends View {
    boolean flag = false;

    @Override
    void show() {

        if (!flag) {
            System.out.println("Show circle ");
            flag = true;
        } else
            System.out.println("Circle already shown ");

    }

    @Override
    void hide() {
        if (flag)
            System.out.println("Hide circle");
        else if (!flag)
            System.out.println("You can't hide circle,because it wasn't shown yet ");

    }
}

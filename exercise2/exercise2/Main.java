package exercise2;

import java.lang.System;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
//beginning of Types Exercise
        Types types = new Types();
        System.out.println(types);

// Ending of types Exercise

//start of Arrays exercise

        Arrays arrays = new Arrays();
        System.out.print(arrays);
//end of arrays exercise

// start of colors exercise

    Colors code = new Colors();
        System.out.println(code.colorful(new String[]{}));
        System.out.println("This is the Colors class");

//This is the end of the colors exercise

//Start of statically exercise:
Statically stats = new Statically("epoxy", "jello");
            System.out.println(stats.getJello());
            System.out.println(stats.getGlue());
            Statically.explain(1, 2);
//end of statically exercise.

//start of monkey exercise:

    }
}











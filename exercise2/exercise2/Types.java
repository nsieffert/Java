package exercise2;

import java.util.Arrays;

class Types {
        int number;
        int[] myArray = {3, 4, 5, 6, 76, 12, 2};
        String characterMovieA = "Harry and the Hendersons";
        String CharacterMovieB = "Star Wars";
        String male = "m";
        String female = "f";

    @Override
    public String toString() {
        return "Types{" +
                "number=" + number +
                ", myArray=" + Arrays.toString(myArray) +
                ", characterMovieA='" + characterMovieA + '\'' +
                ", CharacterMovieB='" + CharacterMovieB + '\'' +
                ", male='" + male + '\'' +
                ", female='" + female + '\'' +
                '}';
    }
}

//    This class has syntax errors, that will prevent your other classes from running.
//    So... work on this file first to resolve the issues.
//    boolean number;
//    const myArray = [3,4,5,6,76,12,2];
//    Character movieA = 'Harry and the Hendersons';
//    Character movieB = 'Star Wars';
//    double male = 'm';
//    double female = 'f';
//
//    //the above instance variables have mistakes with their data types.
//    Fix the data types so the main method correctly displays the value of all of the variables
//
//    public static void main() {
//        System.out.println("There are variables that have been declared in this Accessible class.
//        Fix the code so that all the variables can be accessed by the main method.
//        print out the values of every variable once the code has been refactored.");
//    }

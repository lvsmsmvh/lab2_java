package com.company;

public class SimpleTypes {


    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = .1234;


    // result
    double getResult(){
        return ((f*b) + (i / c) - (d * s));
    }



    // convert types
    int newInt;
    float newFloat;
    double newDouble;
    void convertTypes(){
        newInt = (int) (0.5 + b);
        newFloat = (float) (1.8 - c);
        newDouble = (double) (5.5 * s);
    }



    // increments
    int incrementTest(){
        int a, b = 5, c = 7, d = 9;
        a = b++ + c++ + ++d;
        return a;
    }


    // infinities
    float infinityNegative = 1f / 0f;
    double infinityPositive = -1d / 0d;



    // not a number
    double NaN_1 = 0.0 / 0.0;
    double NaN_2 = (1.0 / 0.0) * 0.0;




    // use Math
    double hypotenuse(double side1, double side2){
        return Math.sqrt(side1 * side1 + side2 * side2);
    }

}

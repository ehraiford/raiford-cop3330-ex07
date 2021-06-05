/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package ex07;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final float converterConstant = 10.764961f;

        System.out.print("What is the length of the room in feet? ");
        int length = in.nextInt();

        System.out.print("What is the width of the room in feet? ") ;
        int width = in.nextInt();

        System.out.print("You entered the dimensions of " + length + " feet by " + width + " feet.");

        int area = length * width;
        float areaMeters = area / converterConstant;

        System.out.print("The area is \n" + area + " square feet \n" + areaMeters + " square meters" );
    }
}

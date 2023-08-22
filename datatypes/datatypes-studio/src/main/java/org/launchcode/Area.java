// Recall that the area of a circle is A = pi * r * r
// where pi is 3.14 and r is the radius.

package org.launchcode;

import java.sql.SQLOutput;
import java.util.*;

public class Area {
    public static  void  main(String[] args) {

        Scanner  input = new Scanner(System.in);
        System.out.println("Enter a radius");

        Double radius = input.nextDouble();
        System.out.println("The area is: " + Circle.getArea(radius));
        input.close();



    }

}

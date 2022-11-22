package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class Line2 {
    public static void main(String[] args) {

        int x1, x2, y1, y2, a1, a2, b1, b2;
        double line1, line2;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x1 point");
        x1 = scan.nextInt();
        System.out.println("enter x2 point");
        x2 = scan.nextInt();
        System.out.println("enter y1 point");
        y1 = scan.nextInt();
        System.out.println("enter y2 point");
        y2 = scan.nextInt();
        line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("distance between point is" + "(" + x1 + "," + x2 + ")," + "(" + y1 + "," + y2 + "):" + line1);
        System.out.println("enter a1 point");
        a1 = scan.nextInt();
        System.out.println("enter a2 point");
        a2 = scan.nextInt();
        System.out.println("enter b1 point");
        b1 = scan.nextInt();
        System.out.println("enter b2 point");
        b2 = scan.nextInt();
        line2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
        System.out.println("distance between point is" + "(" + a1 + "," + a2 + ")," + "(" + b1 + "," + b2 + "):" + line2);

        if (line1 == line2) {
            System.out.println("both are equal");
        } else if (line1 < line2) {
            System.out.println("line1 is less than line2");
        } else {
            System.out.println("line1 is greater than line2");
        }
    }
}



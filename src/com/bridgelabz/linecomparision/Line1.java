package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class Line1 {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        double Length_Of_Line;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter x1 point");
        x1=scan.nextInt();
        System.out.println("enter x2 point");
        x2=scan.nextInt();
        System.out.println("enter y1 point");
        y1=scan.nextInt();
        System.out.println("enter y2 point");
        y2=scan.nextInt();
        //retrun the sq root of no.
        Length_Of_Line=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("distance between point is"+"("+x1+","+x2+"),"+"("+y1+","+y2+")="+Length_Of_Line);

    }


}

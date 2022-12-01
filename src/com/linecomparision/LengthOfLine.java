package com.linecomparision;

import java.util.Scanner;

public class LengthOfLine {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the first coordinator of line x1:");
        int x1 =scanner.nextInt();
        System.out.println("Enter the second coordinator of line x2:");
        int x2 =scanner.nextInt();
        System.out.println("Enter the third coordinator of line y1:");
        int y1 =scanner.nextInt();
        System.out.println("Enter the fourth coordinator of line y2:");
        int y2 =scanner.nextInt();
        int a =x2-x1;
        int b =y2-y1;
        double lengthOfLine =Math.sqrt(a*a+b*b);
        System.out.println("Length_Of_Line = " +lengthOfLine);
    }
}

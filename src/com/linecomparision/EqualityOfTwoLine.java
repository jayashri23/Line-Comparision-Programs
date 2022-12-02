package com.linecomparision;

import java.util.Scanner;

public class EqualityOfTwoLine {
    public static int EnterValue(){
        System.out.println("Enter values in order x1,x2,y1,y2:");
        Scanner sc =new Scanner(System.in);
        int valueof =sc.nextInt();
        return valueof;
    }

    public static void main(String[] args) {
        System.out.println("Enter the co -ordinates of First line :");
        int x1 = EnterValue();
        int x2 = EnterValue();
        int y1 = EnterValue();
        int y2 = EnterValue();

        System.out.println("Enter the coordinator of Second line :");
        int secx1 =EnterValue();
        int secx2 =EnterValue();
        int secy1 =EnterValue();
        int secy2 =EnterValue();

        Integer length_first_line =((x2-x1)^2 +(y2-y1)^2);
        Integer length_second_line =((secx2-secx1)^2 +(secy2-secy1)^2);
        Boolean result = Equality(length_first_line ,length_first_line);
        if (result == true)
            System.out.println("Length of First line = Length of Second line");
        else
            System.out.println("Length of both line are different");
    }

    public static Boolean Equality(Integer first,Integer second){
        Integer length_firstLine = first;
        Integer length_secondLine = second;
        Boolean result = length_firstLine.equals(length_secondLine);
        return (result);
    }
}
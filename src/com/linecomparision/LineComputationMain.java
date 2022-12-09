package com.linecomparision;

public class LineComputationMain {
    public static void main(String[] args) {
        LineComparisionUsingMethod line =new LineComparisionUsingMethod();
        line.setFirstLineX1(3);
        line.setFirstLineX2(4);
        line.setFirstLineY1(5);
        line.setFirstLineY2(6);
        line.setSecondLineX1(6);
        line.setSecondLineX2(4);
        line.setSecondLineY1(8);
        line.setSecondLineY2(5);
        System.out.println("Line Computation Comparison :" +line.toString());
        int lengthOfFirstLine =((line.getFirstLineX2()-line.getFirstLineX1())^2
                +(line.getFirstLineY2()-line.getFirstLineY1())^2);
        int lengthOfSecondLine =((line.getSecondLineX2()-line.getSecondLineX1())^2
                +(line.getSecondLineY2()-line.getFirstLineY1())^2);
        System.out.println("Length of First line =" +lengthOfFirstLine);
        System.out.println("Length of Second line =" +lengthOfSecondLine);
        Boolean equality =Check_Equality(lengthOfFirstLine,lengthOfSecondLine);
        if (equality == true)
            System.out.println("Lines are equal");
        else
            System.out.println("Lines are not equal");

        Integer result = Comparison(lengthOfFirstLine,lengthOfSecondLine);
        if (result == 0 )
            System.out.println("length of first line  = length of second line");
        else if (result < 0)
            System.out.println("length of first line  < length of second line ");
        else
            System.out.println("length of first line > length of first line");
    }
    public static boolean Check_Equality(Integer first ,Integer second){
        Integer lengthOfFirstLine = first;
        Integer lengthOfSecondLine = second;
        Boolean result = lengthOfFirstLine.equals(lengthOfSecondLine);
        return (result);
    }
    public static int Comparison(Integer first,Integer second){
        Integer lengthOfFirstLine = first;
        Integer lengthOfSecondLine = second;
        Integer result =lengthOfFirstLine.compareTo(lengthOfSecondLine);
        return (result);
    }
}

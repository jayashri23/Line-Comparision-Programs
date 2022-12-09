package com.linecomparision;

public class LineComparisionUsingMethod {

    private int firstLineX1;
    private int firstLineX2;
    private int firstLineY1;
    private int firstLineY2;
    private int secondLineX1;
    private int secondLineX2;
    private int secondLineY1;
    private int secondLineY2;

    public int getFirstLineX1() {
        return firstLineX1;
    }

    public void setFirstLineX1(int firstLineX1) {
        this.firstLineX1 = firstLineX1;
    }

    public int getFirstLineX2() {
        return firstLineX2;
    }

    public int getFirstLineY1() {
        return firstLineY1;
    }

    public int getFirstLineY2() {
        return firstLineY2;
    }

    public void setFirstLineY2(int firstLineY2) {
        this.firstLineY2 = firstLineY2;
    }

    public void setFirstLineY1(int firstLineY1) {
        this.firstLineY1 = firstLineY1;
    }

    public void setFirstLineX2(int firstLineX2) {
        this.firstLineX2 = firstLineX2;
    }

    public int getSecondLineX1() {
        return secondLineX1;
    }

    public void setSecondLineX1(int secondLineX1) {
        this.secondLineX1 = secondLineX1;
    }

    public int getSecondLineX2() {
        return secondLineX2;
    }

    public void setSecondLineX2(int secondLineX2) {
        this.secondLineX2 = secondLineX2;
    }

    public int getSecondLineY1() {
        return secondLineY1;
    }

    public void setSecondLineY1(int secondLineY1) {
        this.secondLineY1 = secondLineY1;
    }

    public int getSecondLineY2() {
        return secondLineY2;
    }

    public void setSecondLineY2(int secondLineY2) {
        this.secondLineY2 = secondLineY2;
    }

    @Override
    public String toString() {
        return "LineComparisionUsingMethod{" +
                "firstLineX1=" + firstLineX1 +
                ", firstLineX2=" + firstLineX2 +
                ", firstLineY1=" + firstLineY1 +
                ", firstLineY2=" + firstLineY2 +
                ", secondLineX1=" + secondLineX1 +
                ", secondLineX2=" + secondLineX2 +
                ", secondLineY1=" + secondLineY1 +
                ", secondLineY2=" + secondLineY2 +
                '}';
    }

}
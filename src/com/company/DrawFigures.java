package com.company;

public class DrawFigures {

    public static void drawBox() {

        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
    public static void drawV(){
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }
    public static void drawRoof() {
        System.out.println ("   /\\ ");
        System.out.println ("  /  \\ ");
        System.out.println (" /    \\ ");
    }
    public static void unitedStates(){
        System.out.println("|United|");
        System.out.println("|States|");
    }
    public static void main(String[] args) {

        drawRoof();
        drawV();
        System.out.println();

        drawV();
        drawRoof();
        System.out.println();

        drawRoof();
        drawBox();
        unitedStates();
        drawBox();
        drawRoof();
    }
}
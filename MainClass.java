package com.bridgelabz_genrics;

public class MainClass {
    public static void main(String[] args) {

        MaxString maxString  = new MaxString();
        System.out.println("Test case 1");
        maxString.maxValue("Sun","Moon","Stars");
        System.out.println("Test case 2");
        maxString.maxValue("Orange","Mango","Kiwi");
        System.out.println("Test case 3");
        maxString.maxValue("Boy","Girl","Man");
    }
}






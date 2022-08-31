package com.bridgelabz_genrics;

public class MainClass {
    public static void main(String[] args) {

        MaxFloat maxFloat  = new MaxFloat();
        System.out.println("Test case 1");
        maxFloat.maxValue(2.8F,4.4F,33.2F);
        System.out.println("Test case 2");
        maxFloat.maxValue(62.5F,77.6F,88.8F);
        System.out.println("Test case 3");
        maxFloat.maxValue(99.9F,55.6F,8.3F);
    }
}





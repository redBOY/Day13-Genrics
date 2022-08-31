package com.bridgelabz_genrics;
import java.util.Scanner;

    public class MainClass {
        public static void main(String[] args) {

            MaxValue intMax = new MaxValue();
            System.out.println("Test case 1");
            intMax.maxValue(1,3,5);
            System.out.println("Test case 2");
            intMax.maxValue(2,4,6);
            System.out.println("Test case 3");
            intMax.maxValue(9,11,13);
        }
    }



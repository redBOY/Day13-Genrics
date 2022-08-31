package com.bridgelabz_genrics;

public class MainClass {
    public static void main(String[] args) {

        MaxValue<Integer>maxValue = new MaxValue<>(2,3,4);
        maxValue.testMaximum();
        MaxValue<Float> maxValue1 = new MaxValue<>(5.8F,8.9F,3.3F);
        maxValue1.testMaximum();
        MaxValue<String> maxValue2 = new MaxValue<>("Mango","Banana","Grapes");
        maxValue2.testMaximum();
    }

}


package com.bridgelabz_genrics;

public class Maximum_Float {
    public static float getMax(Float first, Float second, Float third) {
        float max;
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0) {
            max = first;
        } else if (second.compareTo(first) > 0 && second.compareTo(third) > 0) {
            max = second;
        } else {
            max = third;
        }
        return max;
    }

    public static int getMax(Integer first, Integer second, Integer third) {
        int max;
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0) {
            max = first;
        } else if (second.compareTo(first) > 0 && second.compareTo(third) > 0) {
            max = second;
        } else {
            max = third;
        }
        return max;
    }

}


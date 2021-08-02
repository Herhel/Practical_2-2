package com.alfa.work1;

public class MyCalculate {
    public static float calcPi (int elements) {
        float result = 0;
        if (elements > 0) {
            int number = 1;
            for (int i = 0; i < elements; ) {
                result = result + (4f / number);
                number = number + 2;
                i++;
                if (i < elements) {
                    result = result - (4f / number);
                    number = number + 2;
                    i++;
                }
            }
        } else {
            System.out.println("Число введено в неправильном формате. Число должно быть больше 0");
        }
        return result;
    }
}

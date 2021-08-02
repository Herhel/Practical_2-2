package com.alfa.work1;

import java.util.Scanner;

public class Runner {

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов ряда:");
        if (sc.hasNextInt()) {
            System.out.println("\nРезультат вычисления Pi = " + MyCalculate.calcPi(sc.nextInt()) );
        } else {
            System.out.println("Вы ввели не числовое значение.");
        }

        sc.close();
    }
}

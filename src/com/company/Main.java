package com.company;

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) throws MyException {

        /**
         * Реализация функционального интерфейса,
         * которая проверяет делится ли число
         * на 15 без остатка.
         */
        Check check = (f) -> {
            if (f % 15 == 0) {
	            System.out.println("Число делится на 15 без остатка");
	            return true;
            } else {
                System.out.println("Число не делится на 15 без остатка");
                return false;
            }
	    };

        /**
         * Реализация функционального интерфейса,
         * которая проверяет положительное ли число.
         */
	Check check1 = (f) -> {
	    if (f > 0) {
            System.out.println("Число положительное");
            return true;
        } else {
            System.out.println("Число не положительное");
            return false;
        }
    };

        /**
         * Реализация функционального интерфейса,
         * которая проверяет принадлежит ли число
         * последовательности Фибоначчи.
         */
	Check check2 = (f) -> {
	    int a = 1;
	    int b = 1;
	    int c;
	    while (b <= f) {
            if ((f == b)) {
                System.out.println("Число принадлежит последовательности Фибоначчи");
                return true;
            }
            c = a;
            a = b;
            b = c + b;
        }
	    System.out.println("Число не принадлежит последовательности Фибоначчи");
	    return false;
    };

        /**
         * Далее организуется бесконечный цикл,
         * в котором организованна
         * работа с консолью.
         * Вводится число и вызываются реализации
         * функционального интерфейса.
         */
	while (true) {
        try {
            String newLine = System.getProperty("line.separator");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите любое число, кроме 0"
                    + newLine + "Чтобы завершить программу введите 0");
            int f = scanner.nextInt();
            if (f == 0) {
                break;
            }
            check.checkOut(f);
            check1.checkOut(f);
            check2.checkOut(f);
        } catch (Exception e) {
            throw (new MyException());
        }
    }

    }
}

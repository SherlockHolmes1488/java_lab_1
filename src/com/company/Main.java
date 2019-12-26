package com.company;

import org.junit.Test;

import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

public class Main {

    public static void main(String[] args) {

        // write your code here
        System.out.println("Hello World!");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число");
        int n = in.nextInt();
        boolean prost = true;

        int n1 = n;
        int n2 = 0;
        int digit;
        int k = 0;
        while (n1 > 0) {
            digit = n1 % 10; //находим остаток -последнюю цифру числа
            n1 = n1 / 10; // делим нацело - убираем из числа последнюю цифру
            n2 = n2 * 10; //увеличиваем разрядность второго числа
            n2 = n2 + digit; //добавляем очередную цифру
        }
        System.out.print("Обратное ему число:" + n2);

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prost = false;
                break;
            }
        }
        if (prost) {
            k++;
        }


        for (int i = 2; i <= n2 / 2; i++) {
            if (n2 % i == 0) {
                prost = false;
                break;
            }
        }
        if (prost) {
            k++;
        }
        rofl(k);
        // myRofl();


           /* String kk;
            if (k==2) {
                System.out.println("Число супер простое");
                kk="Число супер простое";
            }
                else {
                System.out.println("Число не супер простое");
                kk="Число не супер простое";
            }*/


    }

    public static String rofl(int k) {
        String kk;
        if (k == 2) {
            System.out.println("Число супер простое");
            kk = "Число супер простое";
        } else {
            System.out.println("Число не супер простое");
            kk = "Число не супер простое";
        }
        return kk;
    }
}





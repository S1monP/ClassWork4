package com.company;

import java.util.Arrays;
import java.util.Random;
//import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }

    public static void test1() {

        int[] a = new int[10];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(30);
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i += 2) {
            System.out.println(a[i]);
        }
    }

    public static void test2() {
        int[] a = new int[10];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(30);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) sum += a[i];
        }
        System.out.println(sum);
    }

    public static void test3() {
        int[] a = new int[10];
        Random random = new Random();
        int sum = 1;
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 9 == 0) sum *= a[i];
        }
        System.out.println(sum);

    }

    public static void test4() {
        int[] day = new int[30];
        int sum = 0, a;
        Random random = new Random();
        for (int i = 0; i < day.length; i++) {
            day[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(day));
        for (int i = 0; i < day.length; i++) {
            a = (day[i] == 1) ? 2 : -1;
            sum += a;
            if (sum <= 0) continue;
        }
        System.out.println(sum + " sm");
    }

    public static void test5() {
        Random random = new Random();
        int sum = 0, a = 0, b = 0, c = 0;
        int[] pos = new int[31], min = new int[31], pri = new int[31];
        for (int i = 0; i < pos.length; i++) {
            pos[i] = random.nextInt(500) + 500;
            min[i] = random.nextInt(500) + 400;
            pri[i] = pos[i] - min[i];
            if (pri[i] > b) b = pri[i];
            if (pri[i] < c) c = pri[i];
            sum += pri[i];
            if (pri[i] > 0) a++;
        }
        System.out.println("Поступления " + (Arrays.toString(pos)));
        System.out.println("Расходы  " + (Arrays.toString(min)));
        System.out.println("Прибыль по дням" + Arrays.toString(pri));
        System.out.println("Полная прибыль " + sum);
        System.out.println("Дни с прибылью " + a);
        System.out.println("Максимальная прибыль " + b);
        System.out.println("Максимальный убыток " + c);
    }

    public static void test6() {
        Random random = new Random();
        double[] dli = new double[10], wus = new double[10];
        for (int i = 0; i < dli.length; i++) {
            dli[i] = (random.nextInt(50)/10.0);
            wus[i] = (random.nextInt(50)/10.0);

        }
        Arrays.sort(dli);
        Arrays.sort(wus);
       // System.out.println((Arrays.toString(dli)+"\t"+(Arrays.toString(wus))));
        System.out.println(" Максимум в длинну 1 " + dli[9]);
        System.out.println(" 2 == " + dli[8]);
        System.out.println(" 3 == " + dli[7]);
        System.out.println(" Минимум в длинну 1 " + dli[0]);
        System.out.println(" 2 == " + dli[1]);
        System.out.println(" 3 == " + dli[2]);
        System.out.println(" Максимум в высоту 1 " + wus[9]);
        System.out.println(" 2 == " + wus[8]);
        System.out.println(" 3 == " + wus[7]);
        System.out.println(" Минимум в высоту 1 " + wus[0]);
        System.out.println(" 2 == " + wus[1]);
        System.out.println(" 3 == " + wus[2]);
    }
}

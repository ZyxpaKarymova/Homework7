package org.example;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задача 1");
            int i = 1;
            float savingsPrecent = 15000;
            float total = 0;
            while (total < 2459000) {
                i++;
                savingsPrecent = savingsPrecent + savingsPrecent / 100;
                total = total + savingsPrecent;
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
        {
            System.out.println("Задача 2");
            int i = 1;
            while (i <= 10) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println(" ");
            for (i = 10; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
        {
            System.out.println("Задача 3");
            int i;
            int population = 12_000_000;
            int birthRate = 17;
            int deathRate = 8;
            for (i = 1; i <= 10; i++) {
                population = population + population * birthRate / 1000 - population * deathRate / 1000;
                System.out.println("Год " + i + " численность населения составляет " + population);
            }
        }
        {
            System.out.println("Задача 4");
            int month = 1;
            float deposit = 15000;
            while (deposit < 12_000_000) {
                deposit = deposit * 1.07f;
                //deposit=deposit+deposit*0.07f;
                // System.out.println(deposit);
                System.out.format("Месяц " + month + " накопления " + "%.2f", deposit);
                System.out.println(" ");
                month++;
            }
        }
        {
            System.out.println("Задача 5");
            int month = 1;
            float deposit = 15000;
            while (deposit < 12_000_000) {
                deposit = deposit * 1.07f;
                //deposit=deposit+deposit*0.07f;
                // System.out.println(deposit);
                if (month % 6 == 0) {
                    System.out.format("Месяц " + month + " накопления " + "%.2f", deposit);
                    System.out.println(" ");
                }
                month++;
            }
        }
        {
            System.out.println("Задача 6");
            System.out.println("Задача 5");
            int month = 1;
            int year = 1;
            float deposit = 15000;
            while (year < 10) {
                deposit = deposit * 1.07f;
                //deposit=deposit+deposit*0.07f;
                // System.out.println(deposit);
                if (month % 6 == 0) {
                    System.out.format("Месяц " + month + " год " + year + " накопления " + "%.2f", deposit);
                    System.out.println(" ");
                }
                if (month % 12 == 0) {
                    year++;
                }
                month++;
            }
        }
        {
            System.out.println("Задача 7");
            int i;
            int firstFriday = 4;
            for (i = 1; i <= 31; i++) {
                if ((i == firstFriday) || ((i - firstFriday) % 7 == 0)) {
                    System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
                }
            }
        }
        {
            System.out.println("Задача 8");
            int year;
            int currentYear = 2023;
            int minYear = currentYear - 200;
            int maxYear = currentYear + 100;
            for (year = 0; year < maxYear; year = year + 79) {
                if (year >= minYear) System.out.println(year);
            }
        }
    }
}




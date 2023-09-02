package ru.geekbrains.exceptions.HomeWork01;

class Answer01 {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int num = 10;
        int result = 0;
        for (int i = 0; i < num ; i++) {
            result += array1[i];
        }
        System.out.println(result);
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
//        int[] numerator = new int[] {10, 11, 12, 13, 14};
//        int[] denominator = new int[] {1, 2, 3, 0, 5};
//        int[] result = new int[numerator.length];
//        for (int i = 0; i < numerator.length ; i++) {
//            result[i] = numerator[i] / denominator[i];
//        }
//        System.out.println(Arrays.toString(result));
        int a = 10;
        int b = 0;
        int res = a/b;
        System.out.println(res);
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String a = "1";
        String b = "zzz";
        int result = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println(result);
    }
}

public class PrinterEx01 {
    public static void main(String[] args) {
        Answer01 ans = new Answer01();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}

package ru.geekbrains.exceptions.HomeWork02;

public class Ex02_sandbox {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            double d = 0.0;
            double catchedRes1 = intArray[8] / d;
            if (Double.isInfinite(catchedRes1)) throw (new ArithmeticException());
            System.out.printf("catchedRes1 = %.2f", catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
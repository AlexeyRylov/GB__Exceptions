package ru.geekbrains.exceptions.HomeWork01;
import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int[] resultOk = new int[a.length];
        int[] resultErr = new int[]{0};
        if (a.length != b.length) {
            return resultErr;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (b[i] == 0) {
                    throw new RuntimeException("Деление на ноль");
                } else {
                    resultOk[i] = a[i] / b[i];
                }
            }
            return resultOk;
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class PrinterEx03{
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 0};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}
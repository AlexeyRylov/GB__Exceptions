package ru.geekbrains.exceptions.HomeWork02;

import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных
 */
public class Ex01 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean exitFlag = true;
        while(exitFlag) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Ввод/вывод числа");
            System.out.println("0 - Завершение работы приложения");
            int no = inputInt("Введите целое число");
            System.out.println();

            switch (no) {
                case 0:
                    System.out.println("Приложение остановлено");
                    exitFlag = false;
                    break;
                case 1:
                    EX01("Введите дробное число (разделитель точка)");
                    break;
                default:
                    System.out.println("Некорректный номер задачи,повторите попытку ввода");
                    break;
            }
        }

        /*System.out.println("Введите дробное число (разделитель запятая):");
        try {
            float userInput = sc.nextFloat();
            System.out.printf("Вами введено число %f", userInput);
            sc.close();
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }*/
    }

    private static void EX01(String note) {
        float inputValue = 0;
        boolean inputOk = false;
        while (inputOk == false){
            System.out.printf("%s: ", note);
            String input = scanner.nextLine();
            try{
                inputValue = Float.parseFloat(input);
                System.out.printf("Вами введено число %.2f\n", inputValue);
                inputOk = true;
            } catch (Exception e) {
                System.out.println("Ошибка ввода, попробуйте еще раз");
                //e.printStackTrace(); //если понадобится
            }
        }
    }

    public static int inputInt(String note) {
        int inputValue = 0;
        boolean inputOk = false;
        while (inputOk == false){
            System.out.printf("%s: ", note);
            String input = scanner.nextLine();
            try{
                inputValue = Integer.parseInt(input);
                inputOk = true;
            } catch (Exception e) {
                System.out.println("Ошибка ввода, попробуйте еще раз");
            }
        }
        return inputValue;
    }
}

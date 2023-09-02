package ru.geekbrains.exceptions.HomeWork02;
import ru.geekbrains.exceptions.HomeWork02.Ex01;
import java.util.Scanner;

import static ru.geekbrains.exceptions.HomeWork02.Ex01.inputInt;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Ex04 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean exitFlag = true;
        while (exitFlag) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Ввод строки");
            System.out.println("0 - Завершение работы приложения");
            int no = inputInt("Введите целое число");
            System.out.println();

            switch (no) {
                case 0:
                    System.out.println("Приложение остановлено");
                    exitFlag = false;
                    break;
                case 1:
                    EX04("Введите непустую строку");
                    break;
                default:
                    System.out.println("Некорректный номер задачи,повторите попытку ввода");
                    break;
            }
        }
    }

    private static void EX04(String note) {
        boolean inputOk = false;
        while (inputOk == false){
            System.out.printf("%s: ", note);
            String input = scanner.nextLine();
            try{
                if (input == "") throw new Exception();
                System.out.println("Строка успешно введена\n");
                inputOk = true;
            } catch (Exception e) {
                System.out.println("Пустую строку вводить нельзя, попробуйте еще раз");
                //e.printStackTrace(); //если понадобится
            }
        }
    }

}

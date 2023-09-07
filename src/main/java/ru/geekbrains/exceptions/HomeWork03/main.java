package ru.geekbrains.exceptions.HomeWork03;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static ru.geekbrains.exceptions.HomeWork03.input.InputInt;
import static ru.geekbrains.exceptions.HomeWork03.input.InputStr;
import static ru.geekbrains.exceptions.HomeWork03.parsing.ParseData;

public class main {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        boolean exitFlag = true;
        while (exitFlag){
            System.out.printf("Выберите действие:\n1 - Добавление новой записи\n0 - Завершение работы приложения\n");
            int no = InputInt("Введите номер команды: ");
            System.out.println();

            switch (no){
                case 0:
                    System.out.println("Приложение остановлено");
                    exitFlag = false;
                    break;
                case 1:
                    ArrayList userInput = InputStr("Введите пользователя (разделитель пробел): ФИО, дата рождения, № телефона, пол: \n");
                    //System.out.println(userInput.get(0));
                    if (userInput.get(0).equals(-1)){
                        System.out.println("Введено меньше данных, чем требуется!");
                    } else if (userInput.get(0).equals(-2)) {
                        System.out.println("Введено больше данных, чем требуется!");
                    } else
                        try {
                            ArrayList user = ParseData((String[]) userInput.get(1));
                            File file = new File(String.format(user.get(0) + ".txt"));
                            if (file.exists()){
                                FileWriter writer = new FileWriter (file);
                                writer.append(String.format("<"+user.get(0)+"><"+user.get(1)+"><"+user.get(2)+"><"+user.get(3)+"><"+user.get(4)+"><"+user.get(5)+"\n"));
                                writer.close();
                                System.out.println("Новая запись создана!");
                            } else {
                                file.createNewFile();
                                FileWriter writer = new FileWriter (file);
                                writer.write(String.format("<"+user.get(0)+"><"+user.get(1)+"><"+user.get(2)+"><"+user.get(3)+"><"+user.get(4)+"><"+user.get(5)+"\n"));
                                writer.close();
                                System.out.println("Новый файл создан!");
                            }
                        } catch (Exception e){
//                            e.printStackTrace();
                            System.out.println(e);
                        }
                    break;
            }
        }
    }
}

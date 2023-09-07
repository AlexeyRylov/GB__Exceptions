package ru.geekbrains.exceptions.HomeWork03;

import java.awt.*;
import java.util.ArrayList;

import static ru.geekbrains.exceptions.HomeWork03.main.scanner;

public class input {
    public static int InputInt(String note) {
        int inputValue = 0;
        boolean inputOk = false;
        while (inputOk == false) {
            System.out.printf("%s", note);
            String input = scanner.nextLine();
            try {
                inputValue = Integer.parseInt(input);
                inputOk = true;
            } catch (Exception e) {
                System.out.println("Ошибка ввода, попробуйте еще раз:");
            }
        }
        return inputValue;
    }

    public static ArrayList InputStr(String note) {
        Integer errCode = 0;
        ArrayList list = new ArrayList<>();
        System.out.printf("%s", note);
        String input = scanner.nextLine();
        String[] inputData = input.split(" ");
        if (inputData.length == 6){
            list.add(1);
            list.add(inputData);
            return list;
        } else if (inputData.length < 6) {
            list.add(-1);
            list.add(inputData);
            return list;
        } else {
            list.add(-2);
            list.add(inputData);
            return list;
        }
    }
}

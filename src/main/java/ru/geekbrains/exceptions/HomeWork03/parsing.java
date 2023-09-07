package ru.geekbrains.exceptions.HomeWork03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class parsing {
    public static ArrayList ParseData(String[] inputData) throws Exception {
        String firstName= inputData[0];
        String secondName= inputData[1];
        String lastName= inputData[2];
        String stringDate = inputData[3];
        String telNumber = inputData[4];
        String gender = inputData[5];

        for (int i = 0; i < firstName.length(); i++) {
            if (!Character.isAlphabetic(firstName.charAt(i))) {
                throw new Exception("Фамилия введена неверно!");
            }
        }
        for (int i = 0; i < secondName.length(); i++) {
            if (!Character.isAlphabetic(secondName.charAt(i))) {
                throw new Exception("Имя введено неверно!");
            }
        }
        for (int i = 0; i < lastName.length(); i++) {
            if (!Character.isAlphabetic(lastName.charAt(i))) {
                throw new Exception("Отчество введено неверно!");
            }
        }
        try{
            Date birthday = new SimpleDateFormat("dd.MM.yyyy").parse(stringDate);
        } catch (ParseException e){
            System.out.printf("Формат даты указан неверно: ");
        }
        for (int i = 0; i < telNumber.length(); i++) {
            if (!Character.isDigit(telNumber.charAt(i))) {
                throw new Exception("Номер телефона введен неверно!");
            }
        }
        for (int i = 0; i < gender.length(); i++) {
            if (!Character.isAlphabetic(gender.charAt(i))) {
                throw new Exception("Пол!");
            }
        }
        ArrayList result = new ArrayList();
        result.add(firstName);
        result.add(secondName);
        result.add(lastName);
        result.add(stringDate);
        result.add(telNumber);
        result.add(gender);
        return result;
    }
}

package ru.geekbrains.exceptions.HomeWork02;

public class Ex03 {
//мы сами  main ловим исключения, поэтому из объявления в main удаляем:
//    public static void main(String[] args) throws Exception{
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
//Исключение NullPointerException в коде текущего метода никогда не возникнет, удаляем:
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
//Throwable перемещен в конец ловушек, иначе поймает все выше. В данном методе моно его также удалить
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
//Исключение FileNotFoundException в коде текущего метода никогда не возникнет, удаляем:
//public static void printSum(Integer a, Integer b) throws FileNotFoundException {
    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }
}



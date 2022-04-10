package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.Создание сканера, объявление переменных
        Scanner in = new Scanner(System.in);
        NumFraction f = new NumFraction();
        NumFraction f1 = new NumFraction();

        //2.Вывод на экран
        //Сложение дробей
        f.InputFraction(in);//ввод первой дроби
        f1.InputFraction(in);//ввод второй дроби
        System.out.print("\nСложение дробей: ");//название арифметической операции
        f.DisplayFraction();//вывод первой дроби на экран
        System.out.print(" + ");
        f1.DisplayFraction();//вывод второй дроби на экран
        System.out.print(" = ");
        //вызов метода сложения
        NumFraction f2 = f.Sum(f1);
        f2.DisplayFraction();//вывод результата сложения на экран
        System.out.print("\nВыделение целой части: ");
        f2.FullFraction();// выделение целой части дроби и вывод на экран
        System.out.print("\nСокращение дроби и перевод в десятичный вид: ");
        f2.Simplify();// сокращение дроби и вывод на экран
        f2.Decimal();//перевод обыкновенной дроби в десятичную
        System.out.println();//перенос строки

        //Вычитание дробей
        System.out.print("\nВычитание дробей: ");//название арифметической операции
        f.DisplayFraction();//вывод первой дроби на экран
        System.out.print(" - ");
        f1.DisplayFraction();//вывод второй дроби на экран
        System.out.print(" = ");
        //вызов метода вычитания
        NumFraction f3 = f.Subtraction(f1);
        f3.DisplayFraction();//вывод результата вычитания на экран
        System.out.print("\nВыделение целой части: ");
        f3.FullFraction();// выделение целой части дроби и вывод на экран
        System.out.print("\nСокращение дроби и перевод в десятичный вид: ");
        f3.Simplify();// сокращение дроби и вывод на экран
        f3.Decimal();//перевод обыкновенной дроби в десятичную
        System.out.println();//перенос строки

        //Умножение дробей
        System.out.print("\nУмножение дробей: ");//название арифметической операции
        f.DisplayFraction();//вывод первой дроби на экран
        System.out.print(" * ");
        f1.DisplayFraction();//вывод второй дроби на экран
        System.out.print(" = ");
        //вызов метода умножения
        NumFraction f4 = f.Multiplication(f1);
        f4.DisplayFraction();//вывод результата умножения на экран
        System.out.print("\nВыделение целой части: ");
        f4.FullFraction();// выделение целой части дроби и вывод на экран
        System.out.print("\nСокращение дроби и перевод в десятичный вид: ");
        f4.Simplify();// сокращение дроби и вывод на экран
        f4.Decimal();//перевод обыкновенной дроби в десятичную
        System.out.println();//перенос строки

        //Деление дробей
        System.out.print("\nДеление дробей: ");//название арифметической операции
        f.DisplayFraction();//вывод первой дроби на экран
        System.out.print(" : ");
        f1.DisplayFraction();//вывод второй дроби на экран
        System.out.print(" = ");
        //вызов метода деления
        NumFraction f5 = f.Division(f1);
        f5.DisplayFraction();//вывод результата деления на экран
        System.out.print("\nВыделение целой части: ");
        f5.FullFraction();// выделение целой части дроби и вывод на экран
        System.out.print("\nСокращение дроби и перевод в десятичный вид: ");
        f5.Simplify();// сокращение дроби и вывод на экран
        f5.Decimal();//перевод обыкновенной дроби в десятичную
        System.out.println();//перенос строки

        in.close();//закрываем сканер

        //Вызов конструктора с параметрами по умолчанию
        System.out.print("\nВызываем конструктор с параметрами по умолчанию: ");
        NumFraction f6 = new NumFraction();
        f6.DisplayFraction();//вывод конструктора с параметрами по умолчанию на экран
        System.out.println();//перенос строки

        //Setters
        f6.setNumerator(5);//Задаём новое значение числителя через setters
        f6.setDenominator(15);//Задаём новое значение знаменателя через setters

        //Getters
        System.out.println("Выводим новое значение числителя на экран с помощью getters: " + f6.getNumerator());
        System.out.println("Выводим новое значение знаменателя на экран с помощью getters: " + f6.getDenominator());

        System.out.println("Во всех остальных методах работает конструктор с двумя параметрами");
    }
}

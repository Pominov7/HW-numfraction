package com.company;

import java.util.Scanner;

public class NumFraction {
    // поля класса NumFraction
    private int numerator; // числитель
    private int denominator; // знаменатель
    private int full;// целая часть дроби

    // getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // setters
    public void setNumerator(int value) {
        numerator = value;
    }

    public void setDenominator(int value) {
        denominator = value;
    }

    // Конструкторы
    // 1. Конструктор без параметров - по умолчанию
    public NumFraction() {
        // инициализация полей по умолчанию
        numerator = 1;
        denominator = 2;
    }

    // 2. Конструктор с двумя параметрами int
    public NumFraction(int _numerator, int _denominator) {
        numerator = _numerator;
        denominator = _denominator;
    }

    // Методы класса NumFraction
    // Метод ввода дроби с клавиатуры через консоль
    public void InputFraction(Scanner in) {
        while (true) {
            System.out.println("Введите дробь:");
            System.out.print("Числитель = ");
            numerator = in.nextInt();
            System.out.print("Знаменатель = ");
            denominator = in.nextInt();
            if (numerator == 0 || denominator < 1)
                System.out.println("Введены неверные данные, введите число больше 0");
            else break;
        }
    }

    // Метод вывода класса на консоль
    public void DisplayFraction() {
        // сводим вывод объекта на консоль к выводу его строкового представления
        System.out.print(toString());
    }

    // Метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Метод сложения дробей:
    public NumFraction Sum(NumFraction sum) {
        NumFraction res;
        if (denominator == sum.denominator) {
            res = new NumFraction(numerator + sum.numerator, denominator);
        } else {
            res = new NumFraction((numerator * sum.denominator) + (denominator * sum.numerator)
                    , denominator * sum.denominator);
        }
        return res;
    }

    // Метод вычитания дробей:
    public NumFraction Subtraction(NumFraction sub) {
        NumFraction res;
        if (denominator == sub.denominator) {
            res = new NumFraction(numerator - sub.numerator, denominator);

        } else {
            res = new NumFraction((numerator * sub.denominator) - (denominator * sub.numerator)
                    , denominator * sub.denominator);
        }
        return res;
    }

    // Метод умножения дробей:
    public NumFraction Multiplication(NumFraction mult) {
        NumFraction res;
        res = new NumFraction(numerator * mult.numerator, denominator * mult.denominator);

        return res;
    }

    // Метод деления дробей:
    public NumFraction Division(NumFraction div) {
        NumFraction res;
        if (numerator > 0 && div.numerator > 0) {
            res = new NumFraction(numerator * div.denominator, denominator * div.numerator);
        } else {
            res = new NumFraction(numerator * div.denominator * (-1), denominator * Math.abs(div.numerator));
        }
        return res;
    }

    // Метод выделения целой части дроби:
    public void FullFraction() {
        if (numerator % denominator != 0) {
            full = numerator / denominator;
            numerator %= denominator;
            if (full != 0) {
                System.out.print(full + "(" + Math.abs(numerator) + "/" + denominator + ")");
            } else if (numerator % denominator == 0) {
                full = numerator / denominator;
                System.out.print(full);
            } else if (numerator > denominator) {
                full = numerator / denominator;
                System.out.print(full);
            } else System.out.print("дробь не имеет целую часть");
        } else System.out.print("дробь не имеет целую часть");
    }

    //Метод перевода обыкновенной дроби в десятичную
    public void Decimal() {
        double res;
        res = (double) numerator / (double) denominator + full;
        System.out.print(" ≈ " + res);
    }

    //Метод нахождения НОД:
    public int GcdNod() {
        int gcd = 1;
        for (int i = 1; i <= Math.abs(numerator) && i <= denominator; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

   //Метод сокращения дроби:
    public void Simplify() {
        NumFraction res;
        if (full != 0) {
            res = new NumFraction(Math.abs(numerator) / GcdNod(), denominator / GcdNod());
            System.out.print(full + "(" + res +")");
        } else if (numerator == 0) {
            System.out.print(0);
        } else {
                res = new NumFraction(numerator / GcdNod(), denominator / GcdNod());
                System.out.print(res);
            }
        }
    }


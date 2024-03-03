package ru.vlad.bursaev;

import java.lang.reflect.Method;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException{
        System.out.println("Домашнее задание к семинару 2");

        /*
        Используя Reflection API, напишите программу, которая выводит на экран все методы класса String.
         */

        Class<String> stringClass = String.class;
        Method[] methods = stringClass.getDeclaredMethods();
        System.out.println("Список методов класса String: ");
        Arrays.stream(methods).forEach(System.out::println);
    }
}


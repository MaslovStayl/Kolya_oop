package task1204;

/* 
То ли птица, то ли лампа
Напиши метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.


Requirements:
1. Программа должна выводить текст на экран.
2. Класс Cat менять нельзя.
3. Класс Dog менять нельзя.
4. Класс Bird менять нельзя.
5. Класс Lamp менять нельзя.
6. Метод printObjectType() должен выводить на экран одну из надписей, в зависимости от переданного объекта. Например "Лампа" для объектов типа Solution.Lamp.*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
        if (o instanceof Cat){
            System.out.println(" Кошка ");
        }
        if (o instanceof Bird){
            System.out.println(" Птица ");
        }
        if (o instanceof Lamp){
            System.out.println(" Лампа ");
        }
        if (o instanceof Dog){
            System.out.println(" Собака ");
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}

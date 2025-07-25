package task1205;

/* 
Определимся с животным
Напиши метод, который определяет, объект какого класса ему передали, и возвращает результат: одно из значений — «Корова», «Кит», «Собака», «Неизвестное животное».


Requirements:
1. Программа должна выводить текст на экран.
2. В классе Solution должен быть статический класс Cow.
3. В классе Solution должен быть статический класс Dog.
4. В классе Solution должен быть статический класс Whale.
5. В классе Solution должен быть статический класс Pig.
6. Метод getObjectType() должен возвращать одно значение из: "Корова", "Кит", "Собака", "Неизвестное животное" в зависимости от переданного объекта. Например, "Корова" для объектов типа Solution.Cow.*/

import java.nio.file.WatchKey;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        if (o instanceof Cow) {
            return " Корова ";
        }
        if (o instanceof Dog) {
            return " Собака ";
        }
        if (o instanceof Whale) {
            return " Кит ";
        }
        if (o instanceof Pig) {
            return " Свинья ";
        } else {
            return "Неизвестное животное";
        }
    }

        public static class Cow {
        }

        public static class Dog {
        }

        public static class Whale {
        }

        public static class Pig {
        }
    }

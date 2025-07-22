package task1110;

/* 
Не забываем инкапсулировать
Посмотри внимательно на методы и добавь недостающие поля.


Requirements:
1. В классе Cat должно быть поле типа String с именем name.
2. В классе Cat должно быть поле типа int с именем age.
3. В классе Cat должно быть поле типа int с именем weight.
4. В классе Cat должно быть поле типа int с именем speed.
5. В классе Cat должны быть 4 поля.
6. Все поля класса Cat должны быть private.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private Integer age;
        private Integer weight;
        private Integer speed;

        public Cat(String name, Integer age, Integer weight, Integer speed) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.speed = speed;

        }

        public String getName() {
            return name;
        }
        public void setName(String name) { this.name = name; }

        public Integer getAge() {
            return age;
        }
        public  void setAge(Integer age) {this.age = age; }

        public  Integer getWeight() { return weight; }
        public void setWeight(Integer weight) { this.weight = weight; }

        public Integer getSpeed() { return speed; }
        public void setSpeed(Integer speed) { this.speed = speed; }
    }
}

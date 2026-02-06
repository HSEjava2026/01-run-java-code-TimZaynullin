package ru.hse.lab1;

import ru.hse.lab1.second.Person;

public class Main {
    static void main(String[] args) {
        Person filipp = new Person("Filipp", 18);
        System.out.println("Имя: " + filipp.name);
        System.out.println("Возраст: " + filipp.age);
    }
}


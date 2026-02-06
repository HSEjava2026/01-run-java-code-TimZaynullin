package ru.hse.lab1;

import ru.hse.lab1.second.Person;

/**
 * Выводит параметры человека Филиппа
 *
 * @author — Зайнуллин Тимур
 * @version — 1.0
 * @since — 2026
 */

public class Main {
    static void main(String[] args) {
        Person filipp = new Person("Filipp", 18);
        System.out.println("Имя: " + filipp.name);
        System.out.println("Возраст: " + filipp.age);
    }
}


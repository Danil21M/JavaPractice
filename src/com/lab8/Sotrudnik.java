package com.lab8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sotrudnik {
    public Sotrudnik(String name, int age, int salary) {
        this._name = name;
        this._age = age;
        this._salary = salary;
    }

    public String get_name() {
        return _name;
    }

    private String _name;

    public int get_age() {
        return _age;
    }

    private int _age;

    public int get_salary() {
        return _salary;
    }

    private int _salary;
    public static void olderSotrudnik (List<Sotrudnik> sotrudniks, int n, String letter) {
        System.out.println(
                sotrudniks.stream().sorted(Comparator
                                .comparing(Sotrudnik::get_age).reversed()).map(Sotrudnik::get_name)
                        .limit(n)
                        .collect(Collectors.joining(", ", n + " самых старших сотрудников зовут: ", "."))
        );
        System.out.println(
                sotrudniks.stream().sorted(Comparator
                                .comparing(Sotrudnik::get_age).reversed()).map(Sotrudnik::get_name)
                        .filter(str -> str.startsWith(letter))
                        .collect(Collectors.joining(", ", "Сотрудники начинающиеся на букву " + letter +": ", "."))
        );
    }
}

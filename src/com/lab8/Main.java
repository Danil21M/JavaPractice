package com.lab8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        List<Object> listWorld = new ArrayList<>(Arrays.asList(
                "Петя",
                "Саша",
                "Петя",
                "Ваня",
                "Паша",
                "Макс",
                "Вова",
                "Гена",
                "Гена"
        ));
        String prevalentWord = listWorld.stream().collect(Collectors
                        .groupingBy(String::valueOf, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(prevalentWord);

        List<Sotrudnik> sotrudniks = new ArrayList<>(Arrays.asList(
                (new Sotrudnik("Дмитрий", 22, 1200)),
                (new Sotrudnik("Иван", 26, 1700)),
                (new Sotrudnik("Алексей", 21, 2000)),
                (new Sotrudnik("Максим", 19, 1000)),
                (new Sotrudnik("Андрей", 27, 2000)),
                (new Sotrudnik("Алексия", 18, 2000))
        ));

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        double avgSalary = sotrudniks.stream().mapToInt(Sotrudnik::get_salary).average().getAsDouble();
        System.out.println("Средняя зарплата сотрудников = " + avgSalary);

        System.out.println("Введите количество необходимых сотрудников");
        int n = scanner.nextInt();
        System.out.println("Введите букву имени");
        String letter =  scanner1.nextLine();
        Sotrudnik.olderSotrudnik(sotrudniks, n, letter);
    }
}

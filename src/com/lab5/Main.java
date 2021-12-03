package com.lab5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<String> wordArray = new ArrayList<>();
        wordArray.add("Дерево");
        wordArray.add("дерево");
        wordArray.add("машина");
        wordArray.add("Окно");
        wordArray.add("окно");
        wordArray.add("Окно");
        wordArray.add("стол");
        wordArray.add("кровать");
        wordArray.add("Кровать");
        wordArray.add("Стул");

        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);

        Phonebook phonebook = new Phonebook();

        phonebook.add(3123899, "Князев");
        phonebook.add(5456880, "Зорин");
        phonebook.add(3456783, "Носков");
        phonebook.add(5456562, "Сергеев");
        phonebook.add(9786053, "Андреев");
        phonebook.add(3123021, "Зорин");

        phonebook.get("Князев");
        phonebook.get("Зорин");
        phonebook.get("Андреев");
        phonebook.get("Кириллов");
    }
}

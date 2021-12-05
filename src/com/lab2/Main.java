package com.lab2;

public class Main {
    public static void main(String[] args) {
        IParticipant[] participants = {
                new Human("Danya", 600, 140),
                new Cat("Darsi", 300, 50),
                new Robot("8-Bit", 1000, 200)
        };      //Создаем массив участников

        IObstacle[] obstacles = {
                new Treadmill(DistanceLengthEnum.SHORT),
                new Treadmill(DistanceLengthEnum.LONG),
                new Wall(50),
                new Wall(150)
        };      //Создаем массив препятствий

        for (IParticipant i : participants) {           //Прогоняем участников по массиву
            for (IObstacle j : obstacles) {
                if (!j.OvercomeAnObstacle(i))  {
                    System.out.println(i.getName() + " не смог преодолеть дистанцию!\n");
                    break;
                }
                if(j == obstacles[obstacles.length-1])
                    System.out.println(i.getName() + " Успешно преодолел дистанцию!\n");
            }
        }
    }
}

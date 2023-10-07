package org.example;

public class Main {
    public static void main(String[] args) {

        Marathon[] participants = {
                new Human(700, 150),
                new Cat(100, 200),
                new Robot(500, 0)
        };

        Let[] equipments = {
                new Barrier(50),
                new RunningTrack(500),
                new Barrier(70)
        };

        for (Marathon athlete : participants) {
            for (Let equipment : equipments) {
                equipment.let(athlete);
            }
        }
    }
}

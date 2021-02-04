package geekbrains.lesson_01.participants;

import geekbrains.lesson_01.Animals;

public class Cat extends Animals implements Participant{
    public Cat (String name, int jump, int run, int swim) {
        super(name, jump, run, swim);
    }
}

package geekbrains.lesson_01.participants;

import geekbrains.lesson_01.Animals;

public class Human extends Animals implements Participant{
    public Human (String name, int jump, int run, int swim) {
        super (name, jump, run, swim);
    }
}

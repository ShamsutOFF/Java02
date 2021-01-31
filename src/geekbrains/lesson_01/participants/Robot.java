package geekbrains.lesson_01.participants;

import geekbrains.lesson_01.Machines;

public class Robot extends Machines implements Participant{
    public Robot (String name, int jump, int run) {
        super(name, jump, run);
}
}


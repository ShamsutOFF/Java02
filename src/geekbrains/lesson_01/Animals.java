package geekbrains.lesson_01;

import geekbrains.lesson_01.actions.Jump;
import geekbrains.lesson_01.actions.Run;

public class Animals implements Run, Jump {
    protected String name;
    protected int jump;
    protected int run;

    public Animals (String name, int jump, int run) {
        this.name = name;
        this.jump = jump;
        this.run = run;
        }

    public Animals() {
    }


    @Override
    public boolean jumping(int height) {
        if (jump >= height)  {
            System.out.println (name + " перепрыгнул высоту " + height);
            return true;
        }
        else {
            System.out.println (name + " не взял высоту " + height);
            return false;
        }
    }

    @Override
    public boolean running(int distance) {
        if (run >= distance)  {
            System.out.println (name + " пробежал дистанцию " + distance);
            return true;
        }
        else {
            System.out.println (name + " не взял дистанцию " + distance);
            return false;
        }
    }
}

package geekbrains.lesson_01;

import geekbrains.lesson_01.actions.Jump;
import geekbrains.lesson_01.actions.Run;
import geekbrains.lesson_01.actions.Swim;

public class Machines implements Run, Jump, Swim {
    protected String name;
    protected int jump;
    protected int run;


    public Machines (String name, int jump, int run) {
        this.name = name;
        this.jump = jump;
        this.run = run;
    }

    @Override
    public boolean swimming (int lenght) {

            System.out.println (name + " не поплыл, так как роботы вообще не плавают");
            return false;
        }

    @Override
    public boolean jumping(int height) {
        if (jump >= height)  {
            System.out.println (name + " перепрыгнул стену " + height);
            return true;
        }
        else {
            System.out.println (name + " не взял стену " + height + " ударившись о " + jump);
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
            System.out.println (name + " не взял дистанцию " + distance + " и упал на " +run);
            return false;
        }
    }
}


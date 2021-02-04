package geekbrains.lesson_01;

import geekbrains.lesson_01.actions.Jump;
import geekbrains.lesson_01.actions.Run;
import geekbrains.lesson_01.actions.Swim;

public class Animals implements Run, Jump, Swim {
    protected String name;
    protected int jump;
    protected int run;
    protected int swim;
    public Animals (String name, int jump, int run, int swim) {
        this.name = name;
        this.jump = jump;
        this.run = run;
        this.swim = swim;
        }
    public Animals() {
    }

    @Override
    public boolean swimming (int lenght) {
        if (swim >= lenght)  {
            System.out.println (name + " переплыл длинну " + lenght);
            return true;
        }
        else {
            System.out.println (name + "  проплыл " + swim + " из " + lenght + " и его пришлось спасать");
            return false;
        }
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

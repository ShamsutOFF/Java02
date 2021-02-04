package geekbrains.lesson_01.obstacles;

import geekbrains.lesson_01.participants.Participant;

public class Wall implements Obstacles {
    protected int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int obstacleInfo() {
        return this.height;
    }

    @Override
    public void doIt(Participant participant, int i) {
         participant.jumping (i);
    }

}
package geekbrains.lesson_01.obstacles;

import geekbrains.lesson_01.participants.Participant;

public class Pool implements Obstacles  {
    protected int length;

    public Pool(int length) {
        this.length = length;
    }

    @Override
    public int obstacleInfo() {
        return this.length;
    }

    @Override
    public void doIt(Participant participant, int i) {
        participant.swimming (i);
    }
}

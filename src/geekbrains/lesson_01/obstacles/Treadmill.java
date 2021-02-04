package geekbrains.lesson_01.obstacles;

import geekbrains.lesson_01.participants.Participant;

public class Treadmill implements Obstacles{
    protected int distance;
    public Treadmill (int distance){
        this.distance = distance;
    }

    @Override
    public int obstacleInfo() {
        return this.distance;
    }

    @Override
    public void doIt(Participant participant, int i) {
        participant.running (i);

    }

}
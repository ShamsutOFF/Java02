package geekbrains.lesson_01.obstacles;

public class Treadmill implements Obstacles{
    protected int distance;
    public Treadmill (int distance){
        this.distance = distance;
    }

    @Override
    public int obstacleInfo() {
        return this.distance;
    }

    public int getTreadmillDistance () {return this.distance;}
}
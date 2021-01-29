package geekbrains.lesson_01.obstacles;

public class Treadmill implements Obstacles{
    protected int distance;
    public Treadmill (int distance){
        this.distance = distance;
    }

    @Override
    public int createObstacle() {
        return 0;
    }

    public int getTreadmillDistance () {return this.distance;}
}
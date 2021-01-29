package geekbrains.lesson_01.obstacles;

public class Wall implements Obstacles{
    protected int height;
    public Wall (int height){
        this.height = height;
    }

    @Override
    public int createObstacle() {
        return 0;
    }

    public int getWallHeight () {return this.height;}
}
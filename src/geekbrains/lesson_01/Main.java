package geekbrains.lesson_01;

import geekbrains.lesson_01.obstacles.Obstacles;
import geekbrains.lesson_01.obstacles.Pool;
import geekbrains.lesson_01.obstacles.Treadmill;
import geekbrains.lesson_01.obstacles.Wall;
import geekbrains.lesson_01.participants.Cat;
import geekbrains.lesson_01.participants.Human;
import geekbrains.lesson_01.participants.Participant;
import geekbrains.lesson_01.participants.Robot;

public class Main {

    public static void main(String[] args) {

        Human human = new Human ("Вася", rnd (1,4),rnd (500,2000), rnd (50,1000));
        Cat cat = new Cat ("Барсик", rnd (3,7),rnd (200,1000), rnd (50,300));
        Robot robot = new Robot ("Карбюратор", rnd (0,10),rnd (1000,3000));

        Wall wall = new Wall (rnd (1,10));
        Treadmill treadmill = new Treadmill (rnd (200,3000));
        Pool pool = new Pool (rnd (50,1000));

        Participant[] participants = {human,cat,robot};
        Obstacles[] obstacles = {treadmill,pool,wall};

            for (Obstacles obstacle : obstacles) {
                for (Participant participant : participants) {
                obstacle.doIt (participant, obstacle.obstacleInfo ( ));
            }
        }
    }
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
//        Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
//        Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//
//        Создайте два класса: беговая дорожка и стена, при прохождении через которые,
//        участники должны выполнять соответствующие действия (бежать или прыгать),
//        результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//        У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.

//        Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//        Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.

//        2*. Добавить класс Team, который будет содержать название команды, массив из четырех участников
//        (в конструкторе можно сразу указыватьвсех участников ), метод для вывода информации о членах команды,
//        прошедших дистанцию, метод вывода информации обо всех членах команды.
//        3*. Добавить класс Course (полоса препятствий), в котором будут находиться массив препятствий и метод, который будет просить команду пройти всю полосу;
//        В итоге должно быть что-то вроде:
//
//        public static void main(String[] args) {
//            Course c = new Course(...); // Создаем полосу препятствий
//            Team team = new Team(...); // Создаем команду
//            c.doIt(team); // Просим команду пройти полосу
//            team.showResults(); // Показываем результаты
//        }
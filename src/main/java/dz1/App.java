package dz1;

public class App {

    public static void main(String[] args) {
        // Задание 1.

        Mooving[] moove = {
                new Cat(20,3),
                new Human(30,1),
                new Robot(60, 4)
        };
        for (Mooving mv : moove) {
            mv.jump();
            mv.run();
        }

        // Задание 2.
        Robot robot = new Robot(60,4);
        Cat cat = new Cat(20,3);
        Human human = new Human(30,1);
        Road road = new Road(2);
        Wall wall = new Wall(40);

        if (robot.getPheight() > wall.getHeight() && robot.getPlength() > road.getLength()) {
            System.out.println("Ура! я прошел препятствие"); }  else {
            System.out.println("Сегодня не мой день, увы... ");
        }
        if ( human.getPheight() > wall.getHeight() && human.getPlength() > road.getLength()) {
            System.out.println("Ура! я прошел препятствие");
        }  else {
            System.out.println("Сегодня не мой день, увы... ");
        }
        if (cat.getPheight() > wall.getHeight() && cat.getPlength() > road.getLength()) {
            System.out.println("Ура! я прошел препятствие");
        }  else {
            System.out.println("Сегодня не мой день, увы... ");
        }

        /* Задание 3 не получилось

        Obstacle []obs = {
                new Road(20),
                new Wall(2)
        };
        for (Mooving mv : moove) {
            for(Obstacle obse : obs) {
                if (mv.run() > obs.length&& mv.jump() > obs.length) {
                    System.out.println("Good");
                } else {
                    System.out.println("Bad");
                }



        }

        }*/}}



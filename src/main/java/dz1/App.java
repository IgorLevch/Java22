package dz1;

public class App {

    public static void main(String[] args) {
        Mooving[] moove = {
                new Cat(),
                new Human(),
                new Robot()
        };
        for (Mooving mv : moove) {
            mv.jump();
            mv.run();
        }

    }}

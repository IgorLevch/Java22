package dz1;

public class Human implements Mooving{

    @Override
    public void jump() {
        System.out.println("Human can jump");
    }

    @Override
    public void run() {
        System.out.println("Human can run");

    }
}

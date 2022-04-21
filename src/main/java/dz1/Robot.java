package dz1;

public class Robot implements Mooving{

    @Override
    public void jump() {
        System.out.println("Robot can jump");
    }

    @Override
    public void run() {
        System.out.println("Robot can run");
    }
}

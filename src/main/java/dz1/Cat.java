package dz1;

public class Cat implements Mooving{

    @Override
    public void jump() {
        System.out.println("Cat can jump");
    }

    @Override
    public void run() {
        System.out.println("Cat can run");

    }
}

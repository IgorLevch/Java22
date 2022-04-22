package dz1;

public class Human implements Mooving{

    private int pheight;
    private int plength;

    public Human(int pheight, int plength) {
        this.pheight = pheight;
        this.plength = plength;
    }

    public int getPheight() {
        return pheight;
    }

    public int getPlength() {
        return plength;
    }

    @Override
    public void jump() {
        System.out.println("Human can jump");
    }

    @Override
    public void run() {
        System.out.println("Human can run");

    }
}

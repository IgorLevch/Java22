package dz1;

public class Robot implements Mooving{
    private int pheight;
    private int plength;

    public Robot(int pheight, int plength) {
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
        System.out.println("Robot can jump");
    }

    @Override
    public void run() {
        System.out.println("Robot can run");
    }
}

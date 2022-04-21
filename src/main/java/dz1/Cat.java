package dz1;

public class Cat implements Mooving{
   private int pheight;
    private int plength;

    public Cat(int pheight, int plength) {
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
        System.out.println("Cat can jump");
    }

    @Override
    public void run() {
        System.out.println("Cat can run");

    }

    int overjump (Wall wall) {
        return wall.height-pheight;
    }

}

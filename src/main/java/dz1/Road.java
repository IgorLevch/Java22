package dz1;

public class Road implements Obstacle{
    int length;

    public Road(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}

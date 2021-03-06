package hw3;

public abstract class Box {

    float length;
    float width;
    int height;

    public Box(float length, float width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public abstract boolean validate(float length, float width, int height);

}

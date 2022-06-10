package hw3;

public class Box5 extends Box{


    float box5L = 39.5f;
    float box5W = 27.5f;
    int box5H = 23;

    public Box5(float length, float width, int height) {
        super(length, width, height);
    }


    public boolean validate(float length, float width, int height) {

        if ( length>box5L || width>box5W || height>box5H )
            return false;
        else
            return true;

    }
}

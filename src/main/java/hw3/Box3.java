package hw3;

public class Box3 extends Box{

    float box3L = 23;
    float box3W = 14;
    int box3H = 13;

    public Box3(float length, float width, int height) {
        super(length, width, height);
    }


    public boolean validate(float length, float width, int height) {

        if ( length>box3L || width>box3W || height>box3H )
            return false;
        else
            return true;

    }

}

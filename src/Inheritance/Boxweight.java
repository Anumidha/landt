package Inheritance;

public class Boxweight extends Box
{
    double breadth = -1;

    public Boxweight(double length, double width, double breadth) {
        super(length, width);
        this.breadth = breadth;
    }
}


package com.shape;

public class Square implements Polygon 
{
    private float side;

    public Square(float side) 
    {
        this.side = side;
    }

    @Override
    public void calcArea() 
    {
        float area = side * side;
        System.out.println("Square Area: " + area);
    }

    @Override
    public void calcPeri() 
    {
        float perimeter = 4 * side;
        System.out.println("Square Perimeter: " + perimeter);
    }
}

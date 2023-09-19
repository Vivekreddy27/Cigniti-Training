// com.shape.Rectangle.java
package com.shape;

public class Rectangle implements Polygon {
    private float length;
    private float breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calcArea() {
        float area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }

    @Override
    public void calcPeri() {
        float perimeter = 2 * (length + breadth);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}

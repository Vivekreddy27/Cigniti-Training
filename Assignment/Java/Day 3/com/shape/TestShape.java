// com.test.TestShape.java
package com.test;
import com.shape.Square;
import com.shape.Rectangle;

public class TestShape {
    public static void main(String[] args) {
        // Instantiate a Square
        Square square = new Square(5.0f);
        square.calcArea();
        square.calcPeri();

        // Instantiate a Rectangle
        Rectangle rectangle = new Rectangle(4.0f, 6.0f);
        rectangle.calcArea();
        rectangle.calcPeri();
    }
}

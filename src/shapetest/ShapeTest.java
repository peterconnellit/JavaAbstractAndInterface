/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapetest;

/**
 *
 * @author peter
 */
public class ShapeTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(5.0, 10.0);
        shapes[2] = new Square(5.0);

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape);
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());

            System.out.println();
        }
    }
}

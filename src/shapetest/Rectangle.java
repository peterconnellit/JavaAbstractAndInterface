/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapetest;

/**
 *
 * @author peter
 */
public class Rectangle extends Shape implements Sided {

    protected double length, width;

    public Rectangle(double len, double wid) {
        super("Rectangle");
        length = len;
        width = wid;
    }

    Rectangle(String name) {
        super(name);
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2.0 * (length + width);
    }

    @Override
    public void printSides() {
        System.out.println("Rectangle has 4 sides.");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapetest;

/**
 *
 * @author peter
 */
public class Circle extends Shape implements Sided {

    private double radius;

    public Circle(double rad) {
        super("Circle");
        radius = rad;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2.0 * Math.PI * radius;
    }

    @Override
    public void printSides() {
        System.out.println("Circle has 0 sides.");
    }
}

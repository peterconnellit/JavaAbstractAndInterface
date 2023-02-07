/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapetest;

/**
 *
 * @author peter
 */
public abstract class Shape {

    protected String shapeName;

    public Shape(String name) {
        shapeName = name;
    }

    public abstract double area();

    public abstract double perimeter();

    public String toString() {
        String sides = "";
        if (this instanceof Sided) {
            Sided s = (Sided) this;
            s.printSides();
        }
        return shapeName + " " + sides;
    }

}

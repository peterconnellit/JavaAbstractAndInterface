/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapetest;

/**
 *
 * @author peter
 */
public class Square extends Rectangle implements Sided {

    public Square(double side) {
        super("Square");
        length = width = side;
    }

    @Override
    public void printSides() {
        System.out.println("Square has 4 sides.");
    }
}

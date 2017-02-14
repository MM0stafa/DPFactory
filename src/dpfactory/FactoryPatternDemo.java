/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpfactory;

/**
 *
 * @author Moamenovic
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");

        System.out.println(shape1.calcArea(3, 3));

        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        System.out.println(shape2.calcArea(3, 3));

        Shape shape3 = shapeFactory.getShape("SQUARE");

        System.out.println(shape3.calcArea(3, 3));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpfactory;

/**
 *
 * @author M_Mustafa
 */
public class Rectangle implements Shape {

    @Override
    public double calcArea(double x, double y) {
        return x*y*0.5;
    }



}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nandita
 */
public class Circle extends Shape 
{
    double radius;
    Circle(double r)
    {
        radius=r;
    }
    @Override
    double Area() 
    {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        area=PI*radius*radius;
        return PI;
    }
    
}

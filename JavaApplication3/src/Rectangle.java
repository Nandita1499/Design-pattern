/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nandita
 */
public class Rectangle extends Shape
{
    double hight,width;

    Rectangle(double x,double y)
    {
        hight=x;
        width=y;
    }
    @Override
    double Area()
    {
        area=hight*width;
        return area;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

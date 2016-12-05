/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeste;

import static java.lang.Math.sqrt;

/**
 *
 * @author dani
 */
public class Vector {
    private double x1;
    private double x2;

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public Vector(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
    
    public double modulo(){
        return sqrt(x1*x1+x2*x2);
    }

    public static Vector prod_vect(Vector x1, Vector x2){
	Vector y= new Vector(x1.getX1()-x2.getX2(), x2.getX1()-x1.getX2());	
	return y;
    }
};

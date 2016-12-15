/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeste;

import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import org.jfree.data.xy.XYSeries;

/**
 *
 * @author dani
 */
public class Planeta {
    private double a;
    private double epsilon;
    private double p;
    private double m;

    public Planeta(double a, double epsilon, double p) {
        this.a = a;
        this.epsilon = epsilon;
        this.p = p;
        m = pow(a,3)*pow((2*Math.PI)/p,2);
    }
    
       public Vector posicion(double t){
        double j = (2*Math.PI*t)/p;
        Vector pos;
        double u = NewtonRaphson.newton_raphson(Math.PI, epsilon,j,100);
        //double u = Bessel.Bessel(t, epsilon, p, 100);
        pos = new Vector(a*(cos(u)-epsilon),a*(sqrt(1.0 -(epsilon*epsilon))*sin(u)));
        
        return pos;
        
    }
    
    public XYSeries generarPosiciones(){
        XYSeries serie = new XYSeries("",false);
        double t = 0;
        for (double i=0 ; i<=500 ; i++){
            t = (i*p)/500 ;
            Vector pos = posicion(t);
            serie.add(pos.getX1(), pos.getX2());
            
        }
        
        return serie;
    }
    
    public double distanciaSol(double t){
        return posicion(t).modulo();
    }
    
    
    public double energia(double t){
             
	return -m/(2*a);
    }

    public double area(double t1,double t2){
        double c = sqrt(m*(1-pow(epsilon,2)));
	return (1/2.0)*c*(t2-t1);
    }

 
}

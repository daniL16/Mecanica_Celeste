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

    public Planeta(double a, double epsilon, double p) {
        this.a = a;
        this.epsilon = epsilon;
        this.p = p;
    }
    
       public Vector posicion(double t){
        double j = (2*Math.PI*t)/p;
        Vector pos;
        double u = NewtonRaphson.newton_raphson(Math.PI, epsilon,j,20);
            pos = new Vector(a*(cos(u)-epsilon),a*(sqrt(1-(epsilon*epsilon))*sin(u)));
        
        return pos;
        
    }
    
    public XYSeries generarPosiciones(){
        XYSeries serie = new XYSeries(" ");
        for (double t=0 ; (2*Math.PI*t)/p >= 0 && (2*Math.PI*t)/p <= Math.PI ; t = t+0.5){
            Vector pos = posicion(t);
            serie.add(pos.getX1(), pos.getX2());
        }
      // int k= serie.getItemCount();
      //  for (int i=0 ; i<k;i++){
      //      serie.add(-1*(double)serie.getDataItem(i).getX(),serie.getDataItem(i).getY());
       // }
        return serie;
    }
    
    public static double distanciaSol(Vector x){
        return x.modulo();
    }
    
    public static double energia(Vector x,Vector x_){
        return (1/2)*pow(x_.modulo(),2) + 1/x.modulo();
    }
}

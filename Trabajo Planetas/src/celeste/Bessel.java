/*package celeste;
import java.awt.Robot;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import org.apache.commons.math3.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.RombergIntegrator;

abstract class MyFunction implements UnivariateFunction {
     public double value(int n,double epsilon) {
         double y = cos(n*(u-epsilon*sin(u)));
         return y;
     }
 };

public class Bessel {
   
    public static double J_n(int n,double x,double epsilon){
        MyFunction f;
	RombergIntegrator romberg = new RombergIntegrator();
	return (1/Math.PI)*romberg.integrate(50,f.value(n, x, epsilon),0,Math.PI);
}
    public static double Bessel(double t,double epsilon,double p,int iter){
	double u = (2*Math.PI*t)/p;
	for (int i=0; i< iter ; i++){
		u = u + (2/n)*J_n(i,i*epsilon)*sin((2*Math.PI*i*t)/p);
	}
} ;
*/
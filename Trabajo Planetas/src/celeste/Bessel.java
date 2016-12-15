package celeste;
import static java.lang.Math.sin;
import org.apache.commons.math3.special.BesselJ;


public class Bessel {
   
    public static double Bessel(double t,double epsilon,double p,int iter){
        double j = (2*Math.PI*t)/p;
        double u = j;
	for (int i = 1; i <= iter ; i++){
		u = u + (2/i)*BesselJ.value(iter,i*epsilon)*sin(j*i);
	}
        return u;
    }
} ;

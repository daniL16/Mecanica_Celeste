package celeste;
import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class NewtonRaphson {
   
    
    private static double fi(double u,double epsilon,double j){
		return (double) ((-epsilon*u*cos(u)+epsilon*sin(u)+j)/(1-epsilon*cos(u)));
	}

    public static double newton_raphson(double u_0,double epsilon,double j,int iter){
	double u=u_0;    	
	if (0 < fi(u,epsilon,j) && fi(u,epsilon,j) < Math.PI ){ //hay convergencia	
		for(int i=0; i<iter; i++)
			u = fi(u,epsilon,j);
    		return u;
	}
	else {
		System.out.println("No hay convergencia");
		return u;	
	}
    }
} ;

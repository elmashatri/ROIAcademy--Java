package Detyra8;
import java.util.*;

public class Detyra8 {
	public static void main (String [] args) {
		
	Scanner esh=new Scanner (System.in);
	
	// Detyra 1
	
	double s,t;
	System.out.print("Gjatesia e rruges:");
	s=esh.nextDouble();
	System.out.print("Koha:");
	t=esh.nextDouble();
	
	// Formula per shpejtesi: v=s/t; Formula per nxitim: a=s/(t*t);
	
	double v,ac;
	v=s/t;
	ac=s/Math.pow(t,2);
	System.out.println("Shpejtesia eshte v="+s+"/"+t+" : "+v+" m/s, kurse nxitimi a="+s+"/"+Math.pow(t,2)+" : "+ac+" m/s*s");
	
	System.out.println();
	
	// Detyra 2
	
	double a,b,c;
	System.out.print("a=");
	a=esh.nextDouble();
	System.out.print("b=");
	b=esh.nextDouble();
	System.out.print("c=");
	c=esh.nextDouble();
	
	// Formula per zgjidhjen e ekuacionit kuadratik: r1/r2=(-b+-sqrt(b*b-4*a*c))/(2*a);
	
	double res;
	res=Math.pow(b,2)-4*a*c;
	if(res>0) {
		double r1=(-b+Math.sqrt(res))/(2*a);
		double r2=(-b-Math.sqrt(res))/(2*a);
		System.out.println("Kalkulimi i ekuacionit kuadratik "+a+"*x*x + "+b+"*x + "+c+" eshte:"+"r1="+r1+" dhe r2="+r2);
	}else if(res==0) {
		double r=(-b)/(2*a);
		System.out.println("Kalkulimi i ekuacionit kuadratik "+a+"*x*x + "+b+"*x + "+c+" eshte:"+"r="+r);
	}else {
		System.out.println("Ekuacioni kuadratik nuk ka zgjidhje!");
	}
		
	}
}

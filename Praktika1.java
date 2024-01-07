package Praktika1;
import java.util.*;

public class Praktika1 {
public static void main (String [] args) {
	
	Scanner esh=new Scanner (System.in);
	
	// Detyra 1
	
	float x,y;
	System.out.print("x=");
	x=esh.nextFloat();
	System.out.print("y=");
	y=esh.nextFloat();
	
	if(x>y) {
		System.out.println(x+" eshte me i madh se "+y);
	}else if(x<y) {
		System.out.println(x+" eshte me i vogel se "+y);
	}else {
		System.out.println(x+" dhe "+y+" jane te barabarte.");
	}
	
	System.out.println();
	
	// Detyra 2
	
	float a;
	System.out.print("a=");
	a=esh.nextFloat();
	
	System.out.println(a>0?"Numri a eshte pozitiv":"Numri a eshte negativ");
	
}
}

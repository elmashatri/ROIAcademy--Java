package Detyra6;
import java.util.*;

public class Detyra6 {
	public static void main (String [] args) {

	Scanner esh=new Scanner (System.in);
	
	// Detyra 1
	
	System.out.print("Distanca ne kilometra:");
	double km=esh.nextDouble();
	if(km>0) {
		double mile=km*0.62137;
		System.out.println("Distanca ne mile:"+mile);
	}else if (km<0){
		System.out.println("Distanca eshte dhene gabim!");
	}else {
		System.out.println("Distanca eshte 0!");
	}
	
	System.out.println();
	
	// Detyra 2
	
	System.out.print("Shtyp nje numer:");
	int a=esh.nextInt();
	if(a>0) {
		if(a%2==0) {
			System.out.println(a+" eshte pozitiv dhe cift");
		}else {
			System.out.println(a+" eshte pozitiv dhe tek");
		}
	}else if(a<0) {
		if(a%2==0) {
			System.out.println(a+" eshte negativ dhe cift");
		}else {
			System.out.println(a+" eshte negativ dhe tek");
		}
	}else {
		System.out.println(a+" eshte 0");
	}
	
	}
}

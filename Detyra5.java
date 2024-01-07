package Detyra5;
import java.util.*;

public class Detyra5 {
public static void main (String [] args) {
	
	Scanner esh=new Scanner(System.in);					// Krijimi i scanner esh
	
	// Detyra 1
	
	double i,r;
	System.out.print("Intensiteti:");
	i=esh.nextDouble();
	System.out.print("Rezistenca:");
	r=esh.nextDouble();
	double u;
	u=r*i;
	
	System.out.println("Tensioni elektrik per intensitetin I="+i+" Amper dhe rezistencen R="+r+" Ohm eshte "+u+" Volt.");
	
	System.out.println();
	
	// Detyra 2
	
	System.out.print("Emri:");
	String emri=esh.next();
	System.out.print("Mbiemri:");
	String mbiemri=esh.next();
	System.out.print("Mosha:");
	int mosha=esh.nextInt();
	System.out.print("Gjinia:");
	char gjinia=esh.next().charAt(0);
	System.out.print("Pesha:");
	double pesha=esh.nextDouble();
	System.out.print("Gjatesia:");
	double gjatesia=esh.nextDouble();
	
	System.out.println("------------------------------");
	
	System.out.println("Te dhenat personale:");
	System.out.println("Emri:"+emri);
	System.out.println("Mbiemri:"+mbiemri);
	System.out.println("Mosha:"+mosha);
	System.out.println("Gjinia:"+gjinia);
	System.out.println("Pesha:"+pesha);
	System.out.println("Gjatesia:"+gjatesia);
	
}
}

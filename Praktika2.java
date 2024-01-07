package Praktika2;
import java.util.Arrays;
import java.util.Scanner;

public class Praktika2 {
public static void main (String [] args) {
	
	Scanner esh=new Scanner (System.in);
	
	// Detyra 1
	final double pi=3.14;
	double r;
	System.out.print("Rrezja e rrethit:");
	r=esh.nextDouble();
	
	double P,S;
	if(r>0) {
	P=2*pi*r;
	S=pi*Math.pow(r,2);
	System.out.println("Perimetri i rrethit:"+P);
	System.out.println("Syprina e rrethit:"+S);
	}else {
		System.out.println("Rrezja e rrethit eshte dhene gabim!");
	}
	
	System.out.println();
	
	// Detyra 2
	String f1, f2, f3;
	System.out.print("Fjala 1:");
	f1=esh.next();
	System.out.print("Fjala 2:");
	f2=esh.next();
	System.out.print("Fjala 3:");
	f3=esh.next();
	
	String f[]= {f1,f2,f3};
	Arrays.sort(f);
	System.out.println("Fjala e pare:"+f[0]);
	System.out.println("Fjala e dyte:"+f[1]);
	System.out.println("Fjala e trete:"+f[2]);
	
}
}

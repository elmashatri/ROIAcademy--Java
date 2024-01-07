package Detyra7;
import java.util.*;

public class Detyra7 {
public static void main (String [] args) {
	
	Scanner esh=new Scanner (System.in);
	
	// Detyra 1
	
	System.out.print("Fjala 1:");
	String w1=esh.next();
	System.out.print("Fjala 2:");
	String w2=esh.next();
	
	// Krahasimi i fjaleve per case-sensitive
	
	/*if(w1.equals(w2)) {
		System.out.println("Fjalet: "+w1+" dhe "+w2+" jane te njejta");
	}else {
		System.out.println("Fjalet: "+w1+" dhe "+w2+" nuk jane te njejta");
	}*/
	
	// Krahasimi i fjaleve per case-insensitive
	
		if(w1.equalsIgnoreCase(w2)) {
			System.out.println("Fjalet: "+w1+" dhe "+w2+" jane te njejta");
		}else {
			System.out.println("Fjalet: "+w1+" dhe "+w2+" nuk jane te njejta");
		}
	
	System.out.println();
	
	// Detyra 2
	
	System.out.print("Karakteri:");
	char ch=esh.next().charAt(0);
	
	if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z')) {
		System.out.println(ch+" eshte shkronje");
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='Y' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='y') {
			System.out.println(ch+" eshte zanore");
		}else {
			System.out.println(ch+" eshte bashketingellore");
		}
	}else {
		System.out.println(ch+" nuk eshte shkronje, por ndonje karakter tjeter");
	}
	
}
}

package Detyra1A;
import java.util.*;

public class Detyra1A {
public static void main (String [] args) {
	
	Scanner esh=new Scanner (System.in);
	
	// Thirrja e metodes te Detyra 1
	Personi("Elma","Shatri",21);
	Personi("Erna","Hulaj",21);
	Personi("Ora","Vrapcani",22);
	
	System.out.println();
	
	// Thirrja e metodes te Detyra 2
	int [] num= {1,2,3,4,5};
	System.out.println("Shuma e vargut:"+shuma(num));
	
}

	// Detyra 1
	public static void Personi(String emri, String mbiemri, int mosha) {
		System.out.println(emri+" "+mbiemri+" eshte "+mosha+" vjet.");
	}
	
	// Detyra 2
	public static int shuma(int [] num ) {
		int sum=0;
		for(int i=0;i<=num.length;i++) {
			sum+=i;
		}
		return sum;
	}

}

package Detyra3;

public class Detyra3 {
public static void main (String [] args) {
	
	// Detyra 1
	
	char a=69 , b=108 , c=109 , d=97 ;
	char e=83 , f=104 , g=116 , h=114 , i=105;
	char j=75 , k=111 , l=100 , m=110 , n=82 , o=117 , p=103 ,q=49 , r=40 , s=41 , t=48 , u=67;
	
	System.out.println("Emri:"+a+b+c+d); 												 // Emri : Elma
	System.out.println("Mbiemri:"+e+f+d+g+h+i); 										// Mbiemri : Shatri
	System.out.println("Vendbanimi:"+j+k+l+h+i+m+d+r+n+h+o+p+d+" "+u+","+q+t+t+t+s); 	// Vendbanimi : Kodrina(Rruga C,1000)
	
	System.out.println();
	
	// Detyra 2
	
	String emri="Elma Shatri";
	String emri1="Elma ";
	String emri2="Shatri";
	
	System.out.println("Gjatesia e stringut emri:"+emri.length()); 								// 11
	System.out.println("Pozita e Sh:"+emri.indexOf("Sh")); 										// 5
	System.out.println("Stringu emri me te gjitha karakteret e medha:"+emri.toUpperCase()); 	// ELMA SHATRI
	System.out.println("Stringu emri me te gjitha karakteret e vogla:"+emri.toLowerCase()); 	// elma shatri
	System.out.println("Bashkimi i stringjeve emri1 dhe emri2:"+emri1.concat(emri2)); 			// Elma Shatri
	
	System.out.println();
	
	// Detyra 3
	
	System.out.println("Dhjete..."+"\n"+"\t"+"Njezet\\..."+"\n"+"\\ \"Tridhjete\" ...Dyzet...");
	
	/*
	 Dhjete...
	 	Njezet\...
	 \"Tridhjete" ...Dyzet...
	 */
	
}
}

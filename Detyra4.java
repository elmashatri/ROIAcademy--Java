package Detyra4;

public class Detyra4 {
public static void main (String [] args) {
	
	// Detyra 1
	
	/*
	 	a+b/c-d*(e%f)
	 	
	 	R1-> e%f
	 	R2-> d*R1
	 	R3-> b/c
	 	R4-> R3-R2
	 	R5-> a+R4
	 */
	
	// Detyra 2
	
	int a=8;
	int b=4;
	
	System.out.println(a+"+"+b+"="+(a+b)+"\t,\t"+b+"+"+a+"="+(b+a));	// 12 , 12
	System.out.println(a+"-"+b+"="+(a-b)+"\t,\t"+b+"-"+a+"="+(b-a));	// 4 , -4
	System.out.println(a+"*"+b+"="+(a*b)+"\t,\t"+b+"*"+a+"="+(b*a));	// 32 , 32
	System.out.println(a+"/"+b+"="+(a/b)+"\t,\t"+b+"/"+a+"="+(b/a));	// 2 , 0
	System.out.println(a+"%"+b+"="+(a%b)+"\t,\t"+b+"%"+a+"="+(b%a));	// 0 , 4
	
	System.out.println();
	
	// Detyra 3
	
	int x=4 , y=3;
	int z=(--y)*(x++)%(y++)/(x++);
	
	System.out.println("z="+z);		// z=2*5%4/5=2*1/5=2/5=0 sepse x dhe y jane deklaruar si int 
	
}
}

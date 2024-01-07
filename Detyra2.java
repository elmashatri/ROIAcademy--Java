package Detyra2;

public class Detyra2 {
	public static void main (String [] args) {

	// Detyra 1
	
	byte byteNum=6;
	short shortNum=43;
	int intNum=21;
	long longNum = 243454;
	float floatNum = 2.5222789f;
	double doubleNum = 3.644383943;
	char charValue='E';
	boolean isJava=true;
	
	System.out.println("Tipi byte me emrin byteNum eshte 8 bitesh dhe ka vleren "+byteNum);
	System.out.println("Tipi short me emrin shortNum eshte 16 bitesh dhe ka vleren "+shortNum);
	System.out.println("Tipi int me emrin intNum eshte 32 bitesh dhe ka vleren "+intNum);
	System.out.println("Tipi long me emrin longNum eshte 64 bitesh dhe ka vleren "+longNum);
	System.out.println("Tipi float me emrin floatNum eshte 32 bitesh dhe ka vleren "+floatNum);
	System.out.println("Tipi double me emrin doubleNum eshte 64 bitesh dhe ka vleren "+doubleNum);
	System.out.println("Tipi char me emrin charValue është 16 bitesh dhe ka vleren "+charValue);
	System.out.println("Tipi boolean me emrin isJava është 8 bitesh dhe ka vleren "+isJava);
	
	System.out.println();
	
	// Detyra 2
	
	final byte byteNumber=4;
	final short shortNumber=21;
	final int intNumber=13;
	final long longNumber=354565;
	final float floatNumber=3.6333899f;
	final double doubleNumber=4.755494954;
	final char chValue='S';
	final boolean isJavaLanguage=true;
	final String name="Elma";
	
	System.out.println("Konstanta e tipit byte me emrin byteNumber ka vleren "+byteNumber);
	System.out.println("Konstanta e tipit short me emrin shortNumber ka vleren "+shortNumber);
	System.out.println("Konstanta e tipit int me emrin intNumber ka vleren "+intNumber);
	System.out.println("Konstanta e tipit long me emrin longNumber ka vleren "+longNumber);
	System.out.println("Konstanta e tipit float me emrin floatNumber ka vleren "+floatNumber);
	System.out.println("Konstanta e tipit double me emrin doubleNumber ka vleren "+doubleNumber);
	System.out.println("Konstanta e tipit char me emrin charNumber ka vleren "+chValue);
	System.out.println("Konstanta e tipit boolean me emrin isJavaLanguage ka vleren "+isJavaLanguage);
	System.out.println("Konstanta e tipit String me emrin name ka vleren "+name);
	
	System.out.println();
	
	//byteNumber=3; -> Do shfaqe error sepse nuk mund te vendosesh ndonje vlere tjeter asaj varible qe eshte deklaruar si konstante
	
	// Detyra 3
	
	double x=2.34 , y=56.78 ;
	System.out.println("2.34+56.78="+(x+y));
	
	System.out.println();
	
	// Detyra 4
	
	short r=21 , g=18;
	System.out.println("21+18="+(r+g));
	
	}
}

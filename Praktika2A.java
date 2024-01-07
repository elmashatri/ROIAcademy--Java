package Praktika2A;

public class Praktika2A {
public static void main (String [] args) {
	
	// Thirrja ne metoden main
	SUV suv = new SUV("Black", 2023, 4, true);
    suv.printInfo();
	
}
}

//Klasa baze Automjeti
class Automjeti {
 private String ngjyra;
 private int vitiProdhimit;
 
 public Automjeti(String ngjyra, int vitiProdhimit) {
     this.ngjyra = ngjyra;
     this.vitiProdhimit = vitiProdhimit;
 }
 
 public void printInfo() {
     System.out.println("Ngjyra: " + ngjyra);
     System.out.println("Viti i prodhimit: " + vitiProdhimit);
 }
}

//Klasa Automobili qe trashegon nga Automjeti
class Automobili extends Automjeti {
 private int numriDyerve;
 
 public Automobili(String ngjyra, int vitiProdhimit, int numriDyerve) {
     super(ngjyra, vitiProdhimit);
     this.numriDyerve = numriDyerve;
 }
 
 public void printInfo() {
     super.printInfo();
     System.out.println("Numri i dyerve: " + numriDyerve);
 }
}

//Klasa SUV qe trashegon nga Automobili
class SUV extends Automobili {
 private boolean fourxfour;
 
 public SUV(String ngjyra, int vitiProdhimit, int numriDyerve, boolean fourxfour) {
     super(ngjyra, vitiProdhimit, numriDyerve);
     this.fourxfour = fourxfour;
 }
 
 public void printInfo() {
     super.printInfo();
     System.out.println("4x4: " + fourxfour);
 }
}
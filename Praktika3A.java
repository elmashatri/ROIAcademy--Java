package Praktika3A;
import java.util.*;

public class Praktika3A {
public static void main (String [] args) {
	
	MenaxhoDyqanin menaxheri = new MenaxhoDyqanin();

    // Shto produkte ne liste
    menaxheri.shtoProdukt(new Produkt("Laptop", 1000.0, 5));
    menaxheri.shtoProdukt(new Produkt("Telefon", 500.0, 10));
    menaxheri.shtoProdukt(new Produkt("Televizor", 800.0, 3));
    
    // Shfaq listen e produkteve
    System.out.println("Lista e produkteve:");
    menaxheri.shfaqListeProduktesh();
    
    System.out.println();

    // Fshij produktin "Laptop" nga lista
    menaxheri.fshijProdukt("Laptop");
    
    // Shfaq listen e produkteve pas fshirjes së nje produkti
    System.out.println("Lista pas fshirjes së produktit:");
    menaxheri.shfaqListeProduktesh();
    
    System.out.println();
    
    // Gjej produktin "Televizor" dhe ndrysho sasine ne stok
    Produkt produktTelevizor = menaxheri.gjejProdukt("Televizor");
    if (produktTelevizor != null) {
        produktTelevizor.setSasiaNeStok(5);
    }
    
    // Shfaq listen e produkteve pas azhurnimit të sasise
    System.out.println("Lista pas azhurnimit të sasisë së produktit:");
    menaxheri.shfaqListeProduktesh();
	
}
}

//Klasa Produkt per perfaqesimin e produkteve
class Produkt {
 private String emri;
 private double cmimi;
 private int sasiaNeStok;

 public Produkt(String emri, double cmimi, int sasiaNeStok) {
     this.emri = emri;
     this.cmimi = cmimi;
     this.sasiaNeStok = sasiaNeStok;
 }

 public String getEmri() {
     return emri;
 }

 public double getCmimi() {
     return cmimi;
 }

 public int getSasiaNeStok() {
     return sasiaNeStok;
 }

 public void setSasiaNeStok(int sasia) {
     this.sasiaNeStok = sasia;
 }

 @Override
 public String toString() {
     return "Emri: " + emri + ", Çmimi: " + cmimi + ", Sasia në Stok: " + sasiaNeStok;
 }
}

//Klasa MenaxhoDyqanin për menaxhimin e listës së produkteve
class MenaxhoDyqanin {
 private ArrayList<Produkt> listaProdukteve = new ArrayList<>();

 public void shtoProdukt(Produkt produkt) {
     listaProdukteve.add(produkt);
 }

 public void fshijProdukt(String emriProduktit) {
     listaProdukteve.removeIf(produkt -> produkt.getEmri().equals(emriProduktit));
 }

 public Produkt gjejProdukt(String emriProduktit) {
     for (Produkt produkt : listaProdukteve) {
         if (produkt.getEmri().equals(emriProduktit)) {
             return produkt;
         }
     }
     return null;
 }

 public void shfaqListeProduktesh() {
     for (Produkt produkt : listaProdukteve) {
         System.out.println(produkt);
     }
 }
}


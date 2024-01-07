package Detyra2A;
import java.util.*;

public class Detyra2A {
public static void main (String [] args) {
	
	Scanner esh=new Scanner (System.in);
	
	// Krijimi i dy objekteve te klases Libri duke perdorur konstruktorin Libri
	Libri libri1=new Libri("Keshtjella","Ismail Kadare",1970);
	Libri libri2=new Libri("Idioti","Fyodor Dostoevsky",1869);
	System.out.println("Shtypja e te dhenave per librat:\n");
	System.out.println("Libri 1:"+"\n"+"Titulli:"+libri1.getTitulli()+"\nAutori:"+libri1.getAutori()+"\nViti i publikimit:"+libri1.getViti()+"\n");
	System.out.println("Libri 2:"+"\n"+"Titulli:"+libri2.getTitulli()+"\nAutori:"+libri2.getAutori()+"\nViti i publikimit:"+libri2.getViti());
	
	System.out.println();
	
	// Krijimi i dy objekteve te klases Studenti duke perdorur konstruktorin Studenti
	Studenti studenti1=new Studenti("Elma","Shatri",21);
	Studenti studenti2=new Studenti("Alketa","Osmanaj",20);
	System.out.println("Shtypja e te dhenave per studentet:\n");
	System.out.println("Studenti 1:"+"\n"+"Emri:"+studenti1.getEmri()+"\nMbiemri:"+studenti1.getMbiemri()+"\nMosha:"+studenti1.getMosha()+"\n");
	System.out.println("Studenti 2:"+"\n"+"Emri:"+studenti2.getEmri()+"\nMbiemri:"+studenti2.getMbiemri()+"\nMosha:"+studenti2.getMosha());
	
}
}

// Detyra 1 - Krijimi i klases Libri
class Libri{
	
	// Deklarimi i vetive te klases Libri
	String titulli;
	String autori;
	int viti;
	
	// Krijimi i konstruktorit te klases Libri
	public Libri(String titulli, String autori, int viti) {
		this.titulli=titulli;
		this.autori=autori;
		this.viti=viti;
	}
	
	// Krijimi i get metodes qe kthen titullin e librit
	public String getTitulli () {
		return this.titulli;
	}
	
	// Krijimi i get metodes qe kthen autorin e librit
	public String getAutori() {
		return this.autori;
	}
	
	// Krijimi i get metodes qe kthen vitin e publikimit te librit
	public int getViti() {
		return this.viti;
	}
	
}

// Detyra 2 - Krijimi i klases Studenti
class Studenti{
	
	// Deklarimi i vetive te klases Studenti
	String emri;
	String mbiemri;
	int mosha;
	
	// Krijimi i konstruktorit te klases Studenti
	public Studenti(String emri, String mbiemri, int mosha) {
		this.emri=emri;
		this.mbiemri=mbiemri;
		this.mosha=mosha;
	}
	
	// Krijimi i get metodes qe kthen emrin e studentit
	public String getEmri() {
		return this.emri;
	}
	
	// Krijimi i get metodes qe kthen mbiemrin e studentit
	public String getMbiemri() {
		return this.mbiemri;
	}
	
	// Krijimi i get metodes qe kthen moshen e studentit
	public int getMosha() {
		return this.mosha;
	}
	
}
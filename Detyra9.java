package Detyra9;
import java.util.*;

public class Detyra9 {
	public static void main (String [] args) {
		
		Scanner esh=new Scanner (System.in);
		
		// Detyra 1
		
		int n=esh.nextInt();
		System.out.print("Vlera e kubikeve:");
		int cc=esh.nextInt();
		String rez;
		
		switch(n) {
		case 1:
			if(cc<100) {
				rez="Vlera e kubikeve eshte dhene gabim.";
			}else if(cc<=700) {
				rez="Vlera e kubikeve:"+cc+" cc\nAutomjeti ka fuqi motorike shume te lehte.";
			}else if(cc<=1500) {
				rez="Vlera e kubikeve:"+cc+" cc\nAutomjeti ka fuqi motorike relativisht te lehte.";
			}else if(cc<=2500) {
				rez="Vlera e kubikeve:"+cc+" cc\nAutomjeti ka fuqi motorike normale.";
			}else if(cc<=4000) {
				rez="Vlera e kubikeve:"+cc+" cc\nAutomjeti ka fuqi motorike mbi normale.";
			}else {
				rez="Vlera e kubikeve:"+cc+" cc\nAutomjeti ka fuqi motorike shume te larte.";
			}
			break;
		default:
			rez="Vlera e kubikeve eshte dhene gabim.";
			break;
		}
		System.out.println(rez);
		
		System.out.println();
		
		// Detyra 2
		
		/*System.out.print("Numri i muajit:");
		int m=esh.nextInt();
		
		switch(m) {
		case 1:
			System.out.println("Janar");
			break;
		case 2:
			System.out.println("Shkurt");
			break;
		case 3:
			System.out.println("Mars");
			break;
		case 4:
			System.out.println("Prill");
			break;
		case 5:
			System.out.println("Maj");
			break;
		case 6:
			System.out.println("Qershor");
			break;
		case 7:
			System.out.println("Korrik");
			break;
		case 8:
			System.out.println("Gusht");
			break;
		case 9:
			System.out.println("Shtator");
			break;
		case 10:
			System.out.println("Tetor");
			break;
		case 11:
			System.out.println("Nentor");
			break;
		case 12:
			System.out.println("Dhjetor");
			break;
		default:
			System.out.println("Keni shtypur gabim vleren e muajit!");
			break;
		}*/
		
}
}

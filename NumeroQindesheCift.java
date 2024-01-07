package Praktika4;
import java.util.*;

public class NumeroQindesheCift {
public static void main (String [] args) {
	
	Scanner esh=new Scanner (System.in);
	
	int n;
	
	do {
        System.out.print("Shkruani madhesine e vargut (minimumi 10): ");
        n = esh.nextInt();
    }
	while (n < 10);
	
	int[] vargu = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.println("Shkruani numrin e " + (i + 1) + ": ");
        vargu[i] = esh.nextInt();
    }
    
    int qindesheCift = numeroQindeshet(vargu);
    System.out.println("Jane shtypur gjithsej " + n + " numra dhe " + qindesheCift + " prej tyre ishin qindeshe.");
	
}

	public static int numeroQindeshet(int[] vargu) {
    int count = 0;
    for (int num : vargu) {
        if (num % 100 == 0 && num % 2 == 0) {
            count++;
        }
    }
    return count;
	}

}

package Praktika3;
import java.util.*;

public class NumeroZanoret {
public static void main (String [] main) {
	
	Scanner esh = new Scanner (System.in);
	
	int numFjaleve;
    do {
        System.out.print("Shkruani numrin e fjalëve/fjalive (minimumi 10): ");
        numFjaleve = esh.nextInt();
    } 
    while (numFjaleve < 10);
    
    String[] fjalet = new String[numFjaleve];
    esh.nextLine(); 
    for (int i = 0; i < numFjaleve; i++) {
        System.out.print("Shkruani fjalën/fjalitë " + (i + 1) + ": ");
        fjalet[i] = esh.nextLine();
    }
    
    int gjashteZanore = numeroZanoret(fjalet);

    System.out.println("Jane shtypur gjithsej " + numFjaleve + " fjale/fjali " +
            gjashteZanore + " prej tyre kishin me shume se 6 zanore.");

    esh.close();
    
	}

	public static int numeroZanoret(String[] words) {
    int count = 0;
    for (String word : words) {
        if (numriZanoreve(word) > 6) {
            count++;
        }
    }
    return count;
	}
	
	public static int numriZanoreve(String word) {
        int count = 0;
        String lowerWord = word.toLowerCase();
        for (int i = 0; i < lowerWord.length(); i++) {
            char c = lowerWord.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                count++;
            }
        }
        return count;
    }

}



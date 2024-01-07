package Detyra10;
import java.util.*;

public class ROICount {
	 public static void main(String[] args) {
	        Scanner esh = new Scanner(System.in);
	        System.out.print("Numri i fjaleve/fjalive qe shtypen: ");
	        int numriFjaleve = esh.nextInt();
	        esh.nextLine(); 

	        ROICount roiCount = new ROICount();
	        int fjaleROI = roiCount.shtypFjale(numriFjaleve);

	        System.out.println("Jane shtypur gjithsej " + numriFjaleve + " fjale/fjali dhe " + fjaleROI + " prej tyre fillojnë me numër dhe përmbajnë string-un \"ROI\".");
	    }

	    public int shtypFjale(int numriFjaleve) {
	        int fjaleROI = 0;
	        Scanner elma = new Scanner(System.in);

	        for (int i = 1; i <= numriFjaleve; i++) {
	            System.out.print("Fjala/Fjalia " + i + ": ");
	            String fjala = elma.nextLine();

	            if (containsROI(fjala)) {
	                fjaleROI++;
	            }
	        }

	        return fjaleROI;
	    }

	    public boolean containsROI(String fjala) {
	        return fjala.matches("\\d.*ROI.*");
	    }
}

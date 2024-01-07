package Praktika1A;

public class Praktika1A {
public static void main (String [] args) {
	
	// Krijo nje llogari aktuale
    LlogariaAktuale llogariaAktuale = new LlogariaAktuale(12345, 1000.0, "Emri Pronarit", 500.0, 10.0);

    // Krijo nje llogari te ruajtjes
    LlogariaRuajtjes llogariaRuajtjes = new LlogariaRuajtjes(54321, 5000.0, "Emri Pronarit Tjetër", 5.0);

    // Shfaq informacionet per llogarite
    
    System.out.println("Llogaria Aktuale:");
    System.out.println("Numri i llogarisë: " + llogariaAktuale.getNumriLlogarise());
    System.out.println("Balanca: " + llogariaAktuale.getBalanca());
    System.out.println("Emri i pronarit: " + llogariaAktuale.getEmriPronarit());
    System.out.println("Limiti i borxhit: " + llogariaAktuale.getLimitiBorxhit());
    System.out.println("Tarifa mujore: " + llogariaAktuale.getTarifaMujore());
    
    System.out.println("\nLlogaria e Ruajtjes:");
    System.out.println("Numri i llogarisë: " + llogariaRuajtjes.getNumriLlogarise());
    System.out.println("Balanca: " + llogariaRuajtjes.getBalanca());
    System.out.println("Emri i pronarit: " + llogariaRuajtjes.getEmriPronarit());
    System.out.println("Interesi vjetor: " + llogariaRuajtjes.getInteresiVjetor());
	
}
}

class Llogaria {
    private int numriLlogarise;
    private double balanca;
    private String emriPronarit;

    public Llogaria(int numriLlogarise, double balanca, String emriPronarit) {
        this.numriLlogarise = numriLlogarise;
        this.balanca = balanca;
        this.emriPronarit = emriPronarit;
    }
    
 // Metoda per te marre vleren e numrit të llogarise
    public int getNumriLlogarise() {
        return numriLlogarise;
    }

    // Metoda per te vendosur vleren e numrit te llogarise
    public void setNumriLlogarise(int numriLlogarise) {
        this.numriLlogarise = numriLlogarise;
    }
    
 // Metoda per te marre vleren e balances
    public double getBalanca() {
        return balanca;
    }

    // Metoda per te vendosur vleren e balances
    public void setBalanca(double balanca) {
        this.balanca = balanca;
    }
    
 // Metoda per te marre emrin e pronarit
    public String getEmriPronarit() {
        return emriPronarit;
    }

    // Metoda për të vendosur emrin e pronarit
    public void setEmriPronarit(String emriPronarit) {
        this.emriPronarit = emriPronarit;
    }
}

class LlogariaAktuale extends Llogaria {
    private double limitiBorxhit;
    private double tarifaMujore;

    public LlogariaAktuale(int numriLlogarise, double balanca, String emriPronarit, double limitiBorxhit, double tarifaMujore) {
        super(numriLlogarise, balanca, emriPronarit);
        this.limitiBorxhit = limitiBorxhit;
        this.tarifaMujore = tarifaMujore;
    }
    
 // Metoda per te marre vleren e limitit te borxhit
    public double getLimitiBorxhit() {
        return limitiBorxhit;
    }

    // Metoda per te vendosur vleren e limitit te borxhit
    public void setLimitiBorxhit(double limitiBorxhit) {
        this.limitiBorxhit = limitiBorxhit;
    }
    
 // Metoda per te marre vleren e tarifes mujore
    public double getTarifaMujore() {
        return tarifaMujore;
    }

    // Metoda per te vendosur vleren e tarifes mujore
    public void setTarifaMujore(double tarifaMujore) {
        this.tarifaMujore = tarifaMujore;
    }
}

class LlogariaRuajtjes extends Llogaria {
    private double interesiVjetor;

    public LlogariaRuajtjes(int numriLlogarise, double balanca, String emriPronarit, double interesiVjetor) {
        super(numriLlogarise, balanca, emriPronarit);
        this.interesiVjetor = interesiVjetor;
    }

    // Metoda per te marre vleren e interesit vjetor
    public double getInteresiVjetor() {
        return interesiVjetor;
    }

    // Metoda per te vendosur vleren e interesit vjetor
    public void setInteresiVjetor(double interesiVjetor) {
        this.interesiVjetor = interesiVjetor;
    }
}


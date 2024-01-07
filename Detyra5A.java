package Detyra5A;

public class Detyra5A {
public static void main (String [] args) {
	
	 FootballFormation footballFormation = new FootballFormation("4-4-2", 4, 4, 2);
     BasketballFormation basketballFormation = new BasketballFormation("2-3", 2, 3);

     System.out.println("Football Formation:");
     footballFormation.describe();

     System.out.println("\nBasketball Formation:");
     basketballFormation.describe();
	
}
}

//Klasa bazë "Formation"
class Formation {
 private String name;

 public Formation(String name) {
     this.name = name;
 }

 public void describe() {
     System.out.println("Formation: " + name);
 }
}

class FootballFormation extends Formation {
    private int defenders;
    private int midfielders;
    private int forwards;

    public FootballFormation(String name, int defenders, int midfielders, int forwards) {
        super(name);
        this.defenders = defenders;
        this.midfielders = midfielders;
        this.forwards = forwards;
    }
 // Override metoden "describe" për të shfaqur përshkrimin e formacionit futbollistik
    @Override
    public void describe() {
        super.describe();
        System.out.println("Defenders: " + defenders);
        System.out.println("Midfielders: " + midfielders);
        System.out.println("Forwards: " + forwards);
    }
}

//Klasa e trashëguar "BasketballFormation"
class BasketballFormation extends Formation {
 private int guards;
 private int forwards;

 public BasketballFormation(String name, int guards, int forwards) {
     super(name);
     this.guards = guards;
     this.forwards = forwards;
 }

 // Override metoden "describe" për të shfaqur përshkrimin e formacionit basketbolistik
 @Override
 public void describe() {
     super.describe();
     System.out.println("Guards: " + guards);
     System.out.println("Forwards: " + forwards);
 }
}
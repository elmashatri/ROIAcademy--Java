package Detyra4A;

class A {
    public void display() {
        System.out.println("Metode nga klasa A");
    }
}

class B extends A {
    public void print() {
        System.out.println("Metode nga klasa B");
    }

    public static void main(String[] args) {
        B objB = new B();
        objB.display(); // Klasa B trashegon nga klasa A
        objB.print();    
    }
}
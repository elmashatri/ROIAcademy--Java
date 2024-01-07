package Detyra4A;

class iPhone6 {
    void makeCalls(){
        System.out.println("Calling functionality");
    }
}

// Trashegon nga klasa iPhone6
class iPhone10 extends iPhone6{

    void unlockPhoneByFaceId(){
        System.out.println("Unlocking phone by face Id");
    }

}

// Trashegon nga klasa iPhone10
class iPhone12 extends iPhone10{

    void supportFor5GNetwork(){
        System.out.println("5G network support");
    }

    public static void main(String[] args) {
        iPhone12 iPhone = new iPhone12();
        iPhone.makeCalls();  
        iPhone.unlockPhoneByFaceId(); 
        iPhone.supportFor5GNetwork(); 
    }
}

// Create a class Cellphone with methods to print "Ringing...", "Vibrating...", etc.

public class Cellphone {
    
    public void phoneRings(){
        System.out.println("Ringing...");
    }
    public void phoneVibrates(){
        System.out.println("Vibrating...");
    }
    public void phoneMessage(){
        System.out.println("Received message...");
    }
    public void callingFriend(){
        System.out.println("Calling Your Friend Jackie...");
    }

    public static void main(String[] args) {
        Cellphone realme7 = new Cellphone();
        realme7.phoneRings();
        realme7.phoneVibrates();
        realme7.phoneMessage();
        realme7.callingFriend();
    }
}

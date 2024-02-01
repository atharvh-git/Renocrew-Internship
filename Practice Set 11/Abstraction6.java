// Create an interface TVRemote and use it to inherit another interface SmartTVRemote.

interface TVRemote {
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
}

// Inherit from TVRemote to create SmartTVRemote interface
interface SmartTVRemote extends TVRemote {
    void connectToInternet();
    void navigateSmartMenu();
}

public class Abstraction6 {
    public static void main(String[] args) {
        System.out.println("TVRemote interface inherited successfully by the SmartTVRemote interface!");
    }
}

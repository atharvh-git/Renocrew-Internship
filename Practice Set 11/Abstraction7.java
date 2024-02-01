// Create an interface TVRemote and use it to inherit another interface SmartTVRemote.
// Create a class TV which implements TVRemote interface.

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

class TV implements TVRemote {
    boolean PowerOn = false;
    int currentChannel = 1;

    @Override
    public void powerOn() {
        PowerOn = true;
        System.out.println("TV is powered on.");
    }

    @Override
    public void powerOff() {
        PowerOn = false;
        System.out.println("TV is powered off.");
    }

    @Override
    public void changeChannel(int channel) {
        if (PowerOn) {
            currentChannel = channel;
            System.out.println("Channel changed to: " + currentChannel);
        } else {
            System.out.println("TV is not powered on.");
        }
    }
}

// Example usage
public class Abstraction7 {
    public static void main(String[] args) {
        TV myTV = new TV();
        myTV.powerOn();
        myTV.changeChannel(56);
        myTV.powerOff();
    }
}
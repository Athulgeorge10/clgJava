class Lamp {
    boolean isOn;

    void turnOn() {
        // initialize variable with value true
        isOn = true;
        System.out.println("Light on? " + isOn);

    }

    void turnOff() {
        // initialize variable with value false
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}
public class ClassDemo {

	public static void main(String[] args) {
		//Create Object Reference and Object to it
		Lamp lamp = new Lamp();
		
		// call methods turnOn() and turnOff()
		lamp.turnOn();
		lamp.turnOff();

	}

}
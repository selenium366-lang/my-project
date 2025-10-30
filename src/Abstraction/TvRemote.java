package Abstraction;

public class TvRemote extends Function {
	 @Override
	    void turnOn() {
	        System.out.println("TV is turned ON.");
	    }

	    @Override
	    void turnOff() {
	        System.out.println("TV is turned OFF.");
	    }
	
	// Main class to demonstrate abstraction
	
	    public static void main(String[] args) {
	        Function remote = new TvRemote(); //alternate TvRemote remote = new TvRemote();
	        remote.turnOn();   
	        remote.turnOff();  
	    }

}
	

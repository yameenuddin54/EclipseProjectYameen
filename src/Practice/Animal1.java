package Practice;
//Abstract class
public abstract class Animal1 {
	  // Abstract method (does not have a body)
	  public abstract void animalSound();
	  // Regular method
	  public void sleep() {
	    System.out.println("Zzz");
	  }
   }
	// Subclass (inherit from Animal1)
	class Cat extends Animal1 {
	  public void animalSound() {
	    // The body of animal1Sound() is provided here
	    System.out.println("The Cat says: Meyau");
	  }
	}
	
package section4;

import java.io.*;

public class JavaDemo {
  public static void main(String[] args) {
    var barney = new Person();
    // Using JavaBeans style setter and getter
    barney.setName("Barney Rubble");
    System.out.println(barney.getName());

    // Catching checked exception thrown by Scala method
    var fred = new Employee();
    fred.setName("Fred Flintstone");
    try { // This is Java
      fred.save("/etc/fred.ser");
    } catch (IOException ex) {
      System.out.println("Error saving: " + ex.getMessage());
    }

    // Passing a variable number of arguments to a Scala method
    Misc.process("Calling", "Scala", "from", "Java");
  }
}

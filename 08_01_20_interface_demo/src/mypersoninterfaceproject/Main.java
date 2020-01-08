
package mypersoninterfaceproject;

public class Main {
    
    public static void main(String[] args) {
        
        // Create an object instance of Person class.
        Person person1 = new Person(10000, 20000, "Sang", "Shin");
        
        // You can assign the object instance to
        // PersonInterface type.
        PersonInterface personinterface1 = person1;
        
        // Display data from person1 and personinterface1.
        // Observe that they refer to the same object instance.
        System.out.println("person1.getName() = " + person1.getName() + "," +
                " person1.computeTotalWealth() = " + person1.computeTotalWealth());
        
        System.out.println("personinterface1.getName() = " + personinterface1.getName() + "," +
                " personinterface1.computeTotalWealth() = " + personinterface1.computeTotalWealth());
        
        // Check of object instance that is referred by person1 and 
        // personinterface1 is the same object instance.
        boolean b1 = (person1 == personinterface1);
        System.out.println("Do person1 and personinterface1 point to the same object instance? " + b1);
        
        // Create an object instance of Person class
        // and assign it to the interface type directly.
        PersonInterface personinterface2 = new Person(3000, 4000, "Dadu", "Daniel");
        
        System.out.println("personinterface2.getName() = " + personinterface2.getName() + "," +
                " personinterface2.computeTotalWealth() = " + personinterface2.computeTotalWealth());
        
    }
    
}

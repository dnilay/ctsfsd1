
package myrelationinterfaceproject;

public class Main {
    
    public static void main(String[] args) {
        
        // Create two Line object instances.
        Line line1  = new Line(1.0, 2.0, 1.0, 2.0);
        Line line2  = new Line(2.0, 3.0, 2.0, 3.0);
        
        boolean b1 = line1.isGreater(line1, line2);
        System.out.println("line1 is greater than line2: " + b1);
        boolean b2 = line1.isEqual(line1, line2);
        System.out.println("line1 is equal with line2: " + b2);
        
        // Note that the line3 is object instance of Line type.
        // Because the Line type is also a type of RelationInterface,
        // the line3 variable can be declared as RelationInterface type.
        // This is a very very important concept you need to understand.
        RelationInterface line3  = new Line(1.0, 5.0, 1.0, 5.0);
        boolean b3 = line3.isEqual(line1, line3);
        System.out.println("line1 is equal with line3: " + b3);
        
        System.out.println("Length of line1 is " + line1.getLength());
        System.out.println("Length of line2 is " + line2.getLength());
        
        // The following line of code will generate a compile error since line3
        // is declared as RelationInterface interface type not Line type
        // and the getLength() method is not one of the methods defined
        // in the RelationInterface interface.  It is commented out for now.
        // System.out.println("Length of line3 is " + line3.getLength());
    }
    
}

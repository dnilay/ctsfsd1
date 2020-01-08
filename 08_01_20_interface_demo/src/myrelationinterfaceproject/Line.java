
package myrelationinterfaceproject;

public class Line implements RelationInterface{
    
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    // Constructor method of the Line class.
    public Line(double x1,double x2,double y1,double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    // A new method definition of the Line class
    public double getLength(){
        double length = Math.sqrt(    (x2-x1)*(x2-x1) +
                (y2-y1)*(y2-y1));
        return length;
    }
   
    // Implement isGreater(..) method defined in the Relation interface
    public boolean isGreater( Object a, Object b){
        double aLen = ((Line)a).getLength();
        double bLen = ((Line)b).getLength();
        return (aLen > bLen);
    }
 
    // Implement isLess(..) method defined in the Relation interface 
    public boolean isLess( Object a, Object b){
        double aLen = ((Line)a).getLength();
        double bLen = ((Line)b).getLength();
        return (aLen < bLen);
    }

    // Implement isEqual(..) method defined in the Relation interface
    public boolean isEqual( Object a, Object b){
        double aLen = ((Line)a).getLength();
        double bLen = ((Line)b).getLength();
        return (aLen == bLen);
    }
    
}

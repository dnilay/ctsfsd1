
package myonlineshop;

// Product class is now an abstract class
public abstract class Product {
    
    private double regularPrice;
    
    /** Creates a new instance of Product */
    public Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    // computeSalePrice() is now an abstract method
    public abstract double computeSalePrice();

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
}

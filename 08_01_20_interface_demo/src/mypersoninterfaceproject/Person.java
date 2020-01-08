
package mypersoninterfaceproject;

public class Person implements PersonInterface {
    
    int cashSaving;
    int retirementFund;
    String firstName;
    String lastName;

    Person() {
        
    }
    
    // Constructor with arguments
    Person(int cashSaving,
           int retirementFund,
           String firstName,
           String lastName){
        this.cashSaving = cashSaving;
        this.retirementFund = retirementFund;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // Compute person's total wealth
    public int computeTotalWealth(){
        System.out.println(cashSaving + retirementFund);
        return (cashSaving + retirementFund);
    }
    
    // Get person's name
    public String getName(){
        return firstName + " " + lastName;
    }
    
}

package mypersoninterfaceproject;

// This is an example of new code that uses both the new interface
// and the old interface.
public class PersonAnother implements PersonInterface,
                                      PersonInterfaceAnother{
    
    int cashSaving;
    int retirementFund;
    String firstName;
    String lastName;
    
    // Constructor with arguments
    PersonAnother(int cashSaving,
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
        System.out.println((cashSaving + retirementFund));;
        return (cashSaving + retirementFund);
    }
    
    // Get person's name
    public String getName(){
        return firstName + " " + lastName;
    }
    
    // Implement a new method
    public void newMethod(){
        // Some code
    }
    
}

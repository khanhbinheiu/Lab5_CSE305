// PermanentContract.java
public class PermanentContract extends Contract {

    public PermanentContract(String contractID, String propertyID, String tenantID, double rentAmount) {
        super(contractID, propertyID, tenantID, rentAmount);
    }

    @Override
    public void display() {
        System.out.println("Permanent Contract:");
        System.out.println("Contract ID: " + contractID);
        System.out.println("Property ID: " + propertyID);
        System.out.println("Tenant ID: " + tenantID);
        System.out.println("Rent Amount: $" + rentAmount);
    }
}

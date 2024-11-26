// Contract.java
public abstract class Contract {
    protected String contractID;
    protected String propertyID;
    protected String tenantID;
    protected double rentAmount;

    public Contract(String contractID, String propertyID, String tenantID, double rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    public abstract void display();
}

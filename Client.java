
// Client.java
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Contract Type:");
        System.out.println("1 - Permanent Contract");
        System.out.println("2 - Long Term Contract");
        System.out.println("3 - Short Term Contract");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        System.out.print("Enter Contract ID: ");
        String contractID = scanner.nextLine();

        System.out.print("Enter Property ID: ");
        String propertyID = scanner.nextLine();

        System.out.print("Enter Tenant ID: ");
        String tenantID = scanner.nextLine();

        System.out.print("Enter Rent Amount: ");
        double rentAmount = scanner.nextDouble();

        // Tạo hợp đồng dựa trên lựa chọn
        Contract contract = null;
        switch (choice) {
            case 1:
                contract = new PermanentContract(contractID, propertyID, tenantID, rentAmount);
                break;
            case 2:
                contract = new LongTermContract(contractID, propertyID, tenantID, rentAmount);
                break;
            case 3:
                contract = new ShortTermContract(contractID, propertyID, tenantID, rentAmount);
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        // Hiển thị thông tin hợp đồng
        contract.display();

        scanner.close();
    }
}

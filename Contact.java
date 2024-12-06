import java.util.Scanner;

public class Contact {

    private String name;
    private String email;
    private String state;
    private int phoneNumber;

    public Contact(String name, String email, String state, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.state = state;
        this.phoneNumber = phoneNumber;
    }
    
    public String getName() {
        return this.name; 
    }
    
    public String getEmail() {
        return this.email; 
    }

    public String getState() {
        return this.state; 
    }

    public int getPhoneNumber() {
        return this.phoneNumber; 
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact {" +
            "Name = '" + name + '\'' +
            ", email = '" + email + '\'' +
            ", state = '" + state + '\'' +
            ", phone = '" + phoneNumber + '\'' +
            '}';
    }

    public static Contact createContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter email: ");
        String email = sc.next();
        System.out.println("Enter state: ");
        String state = sc.next();
        System.out.println("Enter phone number: ");
        int phone = sc.nextInt();

        return new Contact(name, email, state, phone);
    }
}

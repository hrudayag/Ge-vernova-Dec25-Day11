import java.util.Scanner;
public class UserRegistration {
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]{2,}");
    }
    public static boolean validateLastName(String lastName) {
        return lastName.matches("[A-Z][a-zA-Z]{2,}");
    }
    public static boolean validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9]+([.][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        return email.matches(emailRegex);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.println(validateFirstName(firstName) ? "Valid First Name" : "Invalid First Name");
        System.out.println(validateLastName(lastName) ? "Valid Last Name" : "Invalid Last Name");
        System.out.println(validateEmail(email) ? "Valid Email" : "Invalid Email");
        sc.close();
    }
}

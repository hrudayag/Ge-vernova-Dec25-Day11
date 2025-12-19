import java.util.Scanner;
public class UserRegistration {
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]{2,}");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        if (validateFirstName(firstName)) {
            System.out.println("Valid First Name");
        } else {
            System.out.println("Invalid First Name");
        }
        sc.close();
    }
}
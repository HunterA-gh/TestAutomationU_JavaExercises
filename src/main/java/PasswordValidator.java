import java.util.Scanner;

public class PasswordValidator { //Chapter 8b, Strings

    public static void main(String[] args) {

        System.out.println("Create An Account\n");

        System.out.println("Password MUST");
        System.out.println("-Be at least 8 characters long");
        System.out.println("-Contain an uppercase letter");
        System.out.println("-Contain a special character");
        System.out.println("-Not contain username");
        System.out.println("-Not same as old password\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = input.next();

        System.out.print("Enter your current password: ");
        String oldPass = input.next();

        System.out.print("Enter your new password: ");
        String newPass = input.next();


        if(newPass.length() < 8 || newPass.contains(username) || newPass.equals(newPass.toLowerCase()) || newPass.matches("[A-Za-z0-9]*")) {
            do {
                System.out.print("Try another password: ");
                newPass = input.next();
                ;
            } while (newPass.length() < 8 || newPass.contains(username) || newPass.equals(newPass.toLowerCase()) || newPass.matches("[A-Za-z0-9]*"));
        }

        System.out.println("Password Changed");







    }
}

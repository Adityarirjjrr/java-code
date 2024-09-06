import java.util.Scanner;

public class loginmodule {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String user_name = scanner.nextLine();
        System.out.print("Enter your password: ");
        String pass_word = scanner.nextLine();

        String username = "xyz_123";
        String password = "pass456";

        if (user_name==(username) && pass_word==(password)) {
            System.out.println("Login successful!");
        } else if (user_name!=(username)  ) {
            System.out.println("Your username is incorrect.");
        }else if (pass_word!=(password)) {
            System.out.println("Your password is incorrect.");
        }
    }
}


import java.util.Scanner;
public class Loginmodule_1 {
    int b=0;
    void Login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

       /* for(int i=0;i<pass.length();i++) {
            char ch = pass.charAt(i);

            if(!Character.isLetterOrDigit(ch)) {
                System.out.println("Invalid password,Must have at least one letter");
            }

        }*/

        char ch=pass.charAt(0);
        if(!Character.isLetter(ch)) {
            if(!Character.isDigit(ch)) {
                System.out.println("Invalid Password,You have must one digit in your password");
            }
        }

    }
    public static void main(String[] args) {
        Loginmodule_1 obj = new Loginmodule_1();
        obj.Login();
    }
}

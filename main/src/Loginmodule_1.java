import java.util.Scanner;
public class Loginmodule_1 {
    int b=0,counter=0;
    char ch;
    boolean Login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        for(int i=0;i<pass.length();i++) {
             ch = pass.charAt(i);

            if(!(pass.length()>=8)){
                System.out.println("Error : Must have at least 8 characters");
                break;
            }

            if(!Character.isLetterOrDigit(ch)) {
                System.out.println("Error : Must have at least one letter");
                break;
            }
            if(Character.isDigit(ch)) {
                counter ++;
            }

        }

        if(counter >2) {

            System.out.println("error: You have must more than 2 digit in your password");
        }


        return false;
    }
    public static void main(String[] args) {
        Loginmodule_1 obj = new Loginmodule_1();
        obj.Login();
    }
}

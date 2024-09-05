import java.util.Scanner;

public class loops_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();

        int a;
        int sm = 0, cap = 0, space = 0, spe = 0, num = 0;

        for(int i=0;i<name.length();i++){
            a = name.charAt(i);
            if(a>97 && a<=123){
                sm++;
            }else if(a>65 && a<=90){
                cap++;
            }
            else if(a == ' ') {
                space++;
            }
            else if(a>='0' && a<='9'){
                num++;
            }
            else
            {
                spe++;
            }
        }
        System.out.println("Capital : " + cap);
    }
}

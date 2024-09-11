import java.util.Scanner;
public class function_2 {
    String name;
    int id;
    int salary;
    String designation;
    int joining_year;

    void employee_details() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name ");
        name = sc.nextLine();

        System.out.println("Enter the id ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline character

        System.out.println("Enter the salary ");
        salary = sc.nextInt();
        sc.nextLine(); // Consume newline character

        System.out.println("Enter the designation ");
        designation = sc.nextLine();

        System.out.println("Enter the joining_year ");
        joining_year = sc.nextInt();
        sc.nextLine(); // Consume newline character
    }

    void employee_details2() {
        System.out.println("Your Nmae Is ="+name);
        System.out.println("your id Is ="+id);
        System.out.println("Your Salary Is ="+salary);
        System.out.println("your Designation Is ="+designation);
        System.out.println("Your joining year Is="+joining_year);

        // Experience Count
        int experience;
        int current_experience = 2024;
        experience = current_experience - joining_year;

        double updatedSalary = salary;
        if (experience > 3 && salary >= 50000) {
            updatedSalary = salary + (salary * 0.25);
        }
        System.out.println("Your Salary is Updated by 25%: " + updatedSalary);
        System.out.println("Experience: " + experience);

        if (experience > 3 && salary >=25000) {
            updatedSalary = salary + (salary * 0.10);
        }
        System.out.println("Your Salary is Updated by 10%: " + updatedSalary);
        System.out.println("Experience: " + experience);
    }

    public static void main(String[] args) {
        function_2 obj = new function_2();
        obj.employee_details();
        obj.employee_details2();
    }
}

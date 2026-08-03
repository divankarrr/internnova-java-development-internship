import java.util.Scanner;
public class task06_incometaxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double tax;

        if (income <= 10000) {
            tax = 0;
        } else if (income <= 30000) {
            tax = (income - 10000) * 0.1;
        } else if (income <= 100000) {
            tax = (20000 * 0.1) + ((income - 30000) * 0.2);
        } else {
            tax = (20000 * 0.1) + (70000 * 0.2) + ((income - 100000) * 0.3);
        }

        System.out.println("Income: $" + income);
        System.out.println("Tax: $" + tax);
        sc.close();
    }
}

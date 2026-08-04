import java.util.Scanner;
public class task07_sumofnaturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i=1;
        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("The sum of natural numbers from 1 to " + n + " is: " + sum);
        sc.close();
    }
}

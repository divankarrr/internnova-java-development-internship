import java.util.Scanner;
public class task07_printnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        
        int n=sc.nextInt();
        int j=1;
        while(j<=n){
            System.out.println(j);
            j++;
        }
        sc.close();
    }
}

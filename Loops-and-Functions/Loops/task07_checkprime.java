import java.util.Scanner;
public class task07_checkprime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println("num is not prime");
                break;
            }
        }
        System.out.println("System.out.println");
        sc.close();
    }
}

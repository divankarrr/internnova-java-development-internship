import java.util.Scanner;
public class task07_break_continue {
    public static void main(String args[]){
        for(int i=0;i<10;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        //exit the code when user inputs the multiple of 10
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.print(n+" ");
        }
    }
}

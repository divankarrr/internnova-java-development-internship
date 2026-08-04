import java.util.Scanner;
public class task07_continue {
    public static void main(String args[]){
        //continue is used to skip the statement
        for(int i=0;i<10;i++){
            if(i==3){
                continue;
            }
            System.out.print(i+" ");
        }
        Scanner sc=new Scanner(System.in);

        do{
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            if(n>100){
                break;
            }
            System.out.println(n+" ");

        }while(true);
        sc.close();

    }
}

import java.util.Scanner;
public class task15_strings {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //char ch[]={'a','b','c','d'};
        String str="abcd";
        String s=new String("abcd");//string are immutable

        //input
        String name=sc.next();
        System.out.println(name);
        String fullname=sc.nextLine();
        System.out.println(fullname);

        //length
        int n=fullname.length();
        System.out.println(n);

        //concatenation
        String naam=fullname+" "+name;
        System.out.println(naam);

        //charAt method
        for(int i=0;i<naam.length();i++){
            System.out.print(str.charAt(i)+" ");
        }

        //compare
        if(str.equals(s)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        //substring is continous letter and subsequence is not continous letter
        String substr=str.substring(0,5);
        System.out.println(substr);
        sc.close();

    }
}
/*
why string are immutable
new keyword alloctes a new memory 


*/
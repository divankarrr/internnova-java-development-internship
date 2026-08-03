public class task04_typepromation {
    public static void main(String args[]){
        char a='a';
        char b='b';
        int sum=a+b; // char is promoted to int during addition
        System.out.println("The sum of a and b is: " + sum);

        // char c=a-b // char is promoted to int during subtraction therefore
        //  the result is int and cannot be assigned to char

        int x=5;
        double y=10.5;
        float z=2.5f;
        double result=x+y+z; // int and float are promoted to double during addition
        System.out.println("The result of the addition is: " + result);

        //byte p=10;
        //byte q=p*2; // byte is promoted to int during multiplication therefore
        // the result is int and cannot be assigned to byte
    }
}
/*
Java automatically promotes smaller data types(short byte char) to larger data types during arithmetic operations.
 This is known as type promotion. 
 For example, when an int and a double are added together, the int is promoted to a double before the addition takes place.
*/
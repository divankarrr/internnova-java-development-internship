public class task18_recursion {
    public static void main(String args[]){
        int n=10;
        printDec(n);
        System.out.println();
        printInc(10);
    }
    public static void printDec(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.println(n);
            return;

        }
        printInc(n-1);
        System.out.print(n+" ");
    }

}
/*stack overflow
    parameter memory 
    too many calls
    
*/
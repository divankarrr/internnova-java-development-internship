public class task19_binaryString {
    public static void main(String args[]){
        binaryString(4, 0, "");

    }
    public static void binaryString(int n,int last,String s){
        if(n==0){
            System.out.println(s);
            return;
        }
        if(last==0){
            binaryString(n-1, 1, s+='1');
        }
        binaryString(n-1, 0, s+"0");

        System.out.println(s);

    }
    
}
/*
print binary strings of size n without consecutive string
*/
public class task15_palindrome{
    public static void main(String args[]){
        String name="naman";
        int low=0;
        int high=name.length()-1;
        while(low<high){
            if(name.charAt(low)!=name.charAt(high)){
                System.out.println("Not palindrome");
                return;
            }
            low++;
            high--;
        }
        System.out.println("Palindrome");
    }
    public static boolean palindrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
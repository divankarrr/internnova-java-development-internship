public class task22_findPermutations {
    public static void main(String args[]){
        String s="abc";
        findPermutation(s, "");

    }
    public static void findPermutation(String s,String ans){
        //base case
        if(s.length()==0){
            System.out.println(ans);
        }

        //recursion
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String NewStr=s.substring(0, i)+s.substring( i+1);
            findPermutation(NewStr, ans+ch);
        }
    }
    
}
/*
abc
abc,acb,bac,bca,cab,cba
n then n factorial outputs
TC n*n factorial

*/
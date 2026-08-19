public class task22_findSubsets {
    public static void main(String args[]){
        String s="abc";
        
        findsubsets(s,"",0);
    }
    public static void findsubsets(String s,String ans,int index){
        if(index==s.length()){
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(index);
        findsubsets(s, ans+ch, index+1);
        
        findsubsets(s, ans, index+1);
    }
    
}
/*
"abc"
output: "",'a','b','c','ab','abc','bc','ac'
*/
/*

TC: O(N*2ki power N)
SC: O(N)
*/
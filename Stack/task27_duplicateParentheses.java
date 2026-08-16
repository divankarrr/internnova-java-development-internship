import java.util.Stack;
public class task27_duplicateParentheses{
    public static void main(String args[]){
        String str="(((a+b)+(c+d)))";
        String s="(a-b)";
        System.out.println(isDuplicate(s)+" "+isDuplicate(str));
        
        
    }
    public static boolean isDuplicate(String str){
        Stack <Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=')'){
                s.push(ch);

            }else{
                int count=0;
                while(s.pop()!='(' ){
                    count++;
                }
                if(count<1){
                    return true;
                }
            }
        }
        return false;
    }
}


//expression ko koi extra brackets surround toh nhi kar rhe hai
//example ((((a+b)+(a+c))))---true
//((a+b)+(a+c))---false
import java.util.Stack;
public class task27_validParentheses {
    public static void main(String args[]){
        String str="(){}[]";
        int n=str.length();
        Stack<Character>s=new Stack<>();
        int i=0;
        boolean flag=true;
        while(i<n ){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' ||ch=='['){//opening
                s.push(ch);
            }else{
                if(s.isEmpty()){//'}}}}}}'
                    flag=false;
                    break;
                }
                char c=s.pop();
                if(ch==')'&& c!='(' || ch=='}' && c!='{' || ch=='[' && c==']'){
                    flag=false;
                    break;
                }
            }
            i++;
        }
        if(!s.isEmpty()){
            flag=false;
        }
        if(flag){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
    
}

public class task19_removeDuplicates {
    static String ans="";
    public static void main(String args[]){
        String word="appnnacollege";
        boolean []visited=new boolean[26];
        remove(word,0,visited);
        System.out.println(ans);
    }
    public static void remove(String word,int index,boolean visited[]){
        if(index==word.length()-1){
            return ;
        }
        char ch=word.charAt(index);
        if(!visited[ch-'a']){
            visited[ch-'a']=true;
            ans+=ch;
        }
        remove(word,index+1,visited);

    }
}

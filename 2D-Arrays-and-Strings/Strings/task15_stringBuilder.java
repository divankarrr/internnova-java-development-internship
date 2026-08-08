public class task15_stringBuilder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder();
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);// n solution

        String str=new String();
        for(char ch='a';ch<='z';ch++){
            str+=ch;
        }
        System.out.println(str);
        //n*26 solution because every time a new string is created 
        // and the character is added at last 
        // therefor we use string builder

        System.out.println(convertCamelFont("hi i am divankar"));
    }
    public static String convertCamelFont(String str){
        StringBuilder sb=new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                sb.append(ch);
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

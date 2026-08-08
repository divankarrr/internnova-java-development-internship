public class task15_largestString {
    public static void main(String args[]){
        String str[]={"aaaacdde","aaacsdsef","desd","frodm"};
        String largest=str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest=str[i];
            }
        }
        System.out.println(str);
    }
}
//str.compareToIgnoreCase()
//n square solution

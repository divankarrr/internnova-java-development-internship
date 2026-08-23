import java.util.Arrays;
import java.util.Comparator;
public class task29_maxLengthChainofPair {
    public static void main(String args[]){
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int ans=1;
        int lastEnd=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>lastEnd){
                ans++;
                lastEnd=pairs[i][1];
            }
        }
        System.out.println(ans);
    }
}
/*
you are given n pair of numbers in every pair the first number is always smaller tha the second number.
A pair (c,d) can come after pair(a,b) if b<c.
find the longest chain which can be formed from a given set of pairs;

*/
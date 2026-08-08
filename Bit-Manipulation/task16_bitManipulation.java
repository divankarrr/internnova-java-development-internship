public class task16_bitManipulation {
    public static void main(String args[]){

        //binary AND &
        System.out.println(5&6);

        //binary OR |
        System.out.println(5|6);

        /*binary xor ^
        0^0=0
        1^1=0;
        0^1=1;
        1^0=1;

         */
        System.out.println(5^6);

        /*
        one complements ~
        not operator
        ~0=1
        ~1=0

        */
       System.out.println(~5);

       //binary left shift <<
       //a*2^b
       System.out.println(5<<2);


       //binary right shift >>
       System.out.println(5>>2);

       //odd even using bitwise and
       int n=9;
       if((n&1)==1){
        System.out.println("ODD");
       }else{
        System.out.println("EVEN");
       }

       //get ith bit
       int i=3;
       int ans=n&(1<<i);
       if(ans==0){
           System.out.println(0);
       }else{
        System.out.println(1);
       }

       //set ith bit
       System.out.println(n|(1<<i));
       System.out.println(clearbit(n, i));
       
    }
    //set ith bit
    public static int setBit(int n,int i){
        return n|(1<<i);
    }
    //clear ith bit
    public static int clearbit(int n,int i){
       int bitmask=1<<i;
       bitmask=~bitmask;
       return n&bitmask;
    
    }
    //update ith bit
    public static int updatebit(int n,int i,int set){
        n=clearbit(n, i);
        int bitmask=set>>i;
        return n|bitmask;

        // if(set==0){
        //     return clearbit(n, i);
        // }else{
        //     return setBit(n, i);
        // }
    }
    //clear last bit
    public static int clearLastbit(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    //clear range of bit
    public static int clearRangeOfBit(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    //check is power of 2
    public static boolean ispowerof2(int n){
        return (n&(n-1))==0;
    }
    //count set bit(count 1's)
    public static int countSetBit(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    //fast exponentiation
    public static int powerofnumber(int n,int a){//a ki power n
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans*=a;
            }
            a*=a;
            n=n>>1;
        }
        return ans;

    }

}

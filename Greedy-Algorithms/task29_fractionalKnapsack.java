import java.util.Comparator;
import java.util.Arrays;
public class task29_fractionalKnapsack {
    public static void main(String args[]){
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;
        double ratio[][]=new double[value.length][2];
        
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }

        //ascending order
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        
        int cap=W;
        double profit=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(cap>=weight[idx]){
                profit+=value[idx];
                cap-=weight[idx];
            }else{
                profit=profit+(ratio[i][1]*cap);
                break;
            }
        }
        System.out.println(profit);
    }
    
}

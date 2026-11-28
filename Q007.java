//Boy_chocolate_or_ice_cream
import java.util.*;
public class Q007{
    private static void chocolate(int i,long dp[]){
        dp[i]=dp[i-1]+dp[i-2];
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        long[] dp=new long[n+1];
        dp[1]=2;
        if(n>=2){
        dp[2]=3;
        }
        int i=3;
        while(i<n+1){
            chocolate(i,dp);
            i++;
        }
        System.out.print(dp[n]);
    }
}
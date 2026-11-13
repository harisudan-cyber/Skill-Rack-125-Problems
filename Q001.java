//DP-CONSONANTS COUNT IN SLIDING WINDOW
import java.util.*;
class Q001{
    private static boolean isConsonent(char ch){
        if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U'){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        String str=scan.next();
        int count=0;
        int[] dp=new int[str.length()];
        for(int i=0;i<k;i++){
            if(isConsonent(str.charAt(i))){
                count++;
            }
        }
        dp[0]=count;
        int j=1;
        for(int i=k;i<str.length();i++){
            if(isConsonent(str.charAt(i-k))){
                count--;
            }
            if(isConsonent(str.charAt(i))){
                count++;
            }
            dp[j++]=count;
        }
        for(int i=0;i<j;i++){
            System.out.print(dp[i]+" ");
        }
        return;
    }
}
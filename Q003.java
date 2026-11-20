//Number of paths-top left to bottom right
import java.util.*;
public class Q003 {
private static void dp(int R,int C,int row,int col,int mat[][],int dp[][]){
    if(mat[row][col]==1){
        dp[row][col]=dp[row][col-1]+dp[row-1][col];
    }
    else if(mat[row][col]==0){
        dp[row][col]=0;
    }
}
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int R=scan.nextInt();
int C=scan.nextInt();
int[][] mat=new int[R][C];
for(int row=0;row<R;row++){
    for(int col=0;col<C;col++){
        mat[row][col]=scan.nextInt();
    }
}
if(mat[0][0]==0){
    System.out.print("no");
    return;
}
int[][] dp=new int[R][C];
dp[0][0]=1;
for(int col=1;col<C;col++){
    if(mat[0][col]==1){
        dp[0][col]=dp[0][col]+dp[0][col-1];
    }
    else{
        dp[0][col]=0;
    }
}
for(int row=1;row<R;row++){
    if(mat[row][0]==1){
        dp[row][0]=dp[row][0]+dp[row-1][0];
    }
}
for(int row=1;row<R;row++){
    for(int col=1;col<C;col++){
        dp(R,C,row,col,mat,dp);
    }
}
if(dp[R-1][C-1]>0){
    System.out.print("yes ");
}
else{
    System.out.print("no");
    return;
}
System.out.print(dp[R-1][C-1]);
	}
}
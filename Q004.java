import java.util.*;
public class Q004{
    private static void dpp(int r,int c,int dp[][],int mat[][]){
        for(int row=r-2;row>=0;row--){
            for(int col=1;col<c;col++){
                if(mat[row][col]==1){
                    dp[row][col]=dp[row][col-1]+dp[row+1][col];
                }
                else{
                    dp[row][col]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		int r=scan.nextInt();
		int c=scan.nextInt();
		int[][] mat=new int[r][c];
		for(int row=0;row<r;row++){
		    for(int col=0;col<c;col++){
		        mat[row][col]=scan.nextInt();
		    }
		}
		int[][] dp=new int[r][c];
		if(mat[r-1][0]==0){
		    System.out.print("no");
		    return;
		}
		dp[r-1][0]=1;
		for(int i=r-2;i>=0;i--){
		    if(mat[i][0]==1){
		        dp[i][0]=dp[i+1][0];
		    }
		    else{
		        dp[i][0]=0;
		    }
		}
        for(int i=1;i<c;i++){
		    if(mat[r-1][i]==1){
		        dp[r-1][i]=dp[r-1][i-1];
		    }
		    else{
		        dp[r-1][i]=0;
		    }
		}
		dpp(r,c,dp,mat);
        if(dp[0][c-1]>0){
            System.out.print("yes ");
		System.out.print(dp[0][c-1]);
        }
        else{
            System.out.print("no");
        }
	}
}
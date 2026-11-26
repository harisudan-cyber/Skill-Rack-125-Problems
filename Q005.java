import java.util.*;
public class Q005{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int currsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currsum=Math.max(arr[i],currsum+arr[i]);
            max=Math.max(currsum,max);
        }
        System.out.print(max);
    }
}
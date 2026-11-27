//MINIMUM_SUM_OF_SUBSTRING
import java.util.*;
public class Q006{

    public static void main(String[] args) {
		//Your Code Here
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
    arr[i]=scan.nextInt();
}
int currmin=0;
int min=Integer.MAX_VALUE;
for(int i=0;i<n;i++){
    currmin=Math.min(arr[i],currmin+arr[i]);
    min=Math.min(min,currmin);
}
System.out.print(min);
	}
}
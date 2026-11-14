//DP-EQUAL COUNT-VOWELS & CONSONANTS
import java.util.*;
public class Q002{
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
        String str=scan.next();
        int a=scan.nextInt();
        int count=0;
        int ccount=0;
        int vcount=0;
        for(int i=0;i<a;i++){
            if(isConsonent(str.charAt(i))){
                ccount++;
            }
            else{
                vcount++;
            }
        }
        if(ccount==vcount) count++;
        for(int i=a;i<str.length();i++){
            if(isConsonent(str.charAt(i-a))){
                ccount--;
            }
            else{
                vcount--;
            }if(isConsonent(str.charAt(i))){
                ccount++;
            }
            else{
                vcount++;
            }
            if(ccount==vcount) count++;
        }
        System.out.print(count);
    }
}
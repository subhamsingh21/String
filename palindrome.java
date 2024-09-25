import java.util.*;

public class palindrome{
    public static boolean ispalindrome(String word){
        int n=word.length();
        for(int i=0;i<word.length();i++){

            if(word.charAt(i)!=word.charAt(n-1-i)){
             System.out.print("not a palindrome - ");
                return false;
            }
        } System.out.print("its palindrome -  ");
    
        return true;
    }
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
       System.out.println(ispalindrome(word));
        
    }
}
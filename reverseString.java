public class reverseString{
  
  public static String stringRev(String s,String rev){
    for(int i=s.length()-1;i>=0;i--){
       rev += s.charAt(i);
    }
      return rev;
    // System.out.println(rev);
  }

  public static void main(String ar[]){
    String s="subham";
    String rev="";
    System.out.println(stringRev(s,rev));
  }
}
public class subString {
    public static String printSubstring(String str,int si,int sl){
        String substring ="";
        for(int i=si;i<sl;i++){
            substring += str.charAt(i);
           
        } 
        return substring;
    }
    public static void main(String ar[]){
        String str = "SubhamSingh";
       
        // String si="";
        // String sl="";
        System.out.println(printSubstring(str,3,5)); 
    }
    
}

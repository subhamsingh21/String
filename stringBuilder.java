public class stringBuilder {
    public static void main(String ar[]){
        StringBuilder sb = new StringBuilder("");
        // sb.toString();
        for( char ch='a'; ch<'z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
    
}

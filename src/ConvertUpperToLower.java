public class ConvertUpperToLower {
    public static void main(String[] args) {
        String str = "WeLcomEWW";

        char[] s = str.toCharArray();

        for(int i = 0; i< s.length; i++){
            char ch = s[i];
           if(ch >= 'A' && ch <= 'a'){
                char c = (char)(ch - 'A' + 'a');
                s[i] = c;
           }
        }
        System.out.print(s);


    }
}

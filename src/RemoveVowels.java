public class RemoveVowels {
    public static void main(String[] args) {
        String str = "Welcome";
        String[] vowels = {"a","e","i","o","u"};
        String result = "";
//        for(int i  = 0; i < str.length(); i++){
//            char ch = str.charAt(i);
//            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
//                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
//            // Append non-vowel character to result
//                result += ch;
//            }
//        }
//        System.out.print(result);
        for(int i  = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isVowel = false;
            for (String vowel : vowels) {
                if(vowel.charAt(0) == ch){
                    isVowel = true;
                    break;
                }
            }
            if(!isVowel){
                result += ch;
            }

        }
        System.out.println(result);

//        for(int i  = 0; i < str.length(); i++){
//         char ch = str.charAt(i);
//         if(ch == 'a'  || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
//             continue;
//         }
//         System.out.print(ch);
//        }
    }
}

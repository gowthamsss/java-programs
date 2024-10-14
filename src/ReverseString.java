import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String input = sc.nextLine();
        String[] SentenceSplit = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = SentenceSplit.length - 1; i >= 0; i--) {
            reversed.append(SentenceSplit[i]).append(" ");
        }
        System.out.println("Reversed sentence: " + reversed.toString().trim());

    }
}

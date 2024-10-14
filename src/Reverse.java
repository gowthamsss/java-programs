public class Reverse {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        int temp = num;
        while(num > 0){
            int rem = num % 10;
            count = count * 10 + rem;
            num= num / 10;
        }

        System.out.println(count); // reverse the digit
        if (temp == count){
            System.out.println(temp + " is palindrome");
        }
        else {
            System.out.println(temp + " is not palindrome");
        }

    }
}

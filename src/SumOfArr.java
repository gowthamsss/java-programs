import java.util.Scanner;

public class SumOfArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements" );
        int n = sc.nextInt();
        int[] arr = new int[n];
        int ans = 0;
        System.out.println("Enter array of "+ n + " elements" );
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            ans+= arr[i];
        }
        System.out.println("Sum of arr elements : " + ans );
    }
}

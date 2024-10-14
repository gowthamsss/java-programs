import java.util.Scanner;

public class SubArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements" );
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array of "+ n + " elements" );
        for (int i = 0; i< n; i++){
            arr[i]= sc.nextInt();
        }


        for(int startIndex = 0; startIndex < arr.length; startIndex++){
            for (int endIndex = startIndex; endIndex < arr.length; endIndex++){
                for(int k = startIndex; k <= endIndex; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}

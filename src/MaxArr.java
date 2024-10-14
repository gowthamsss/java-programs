import java.util.Scanner;

public class MaxArr
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements" );
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array of "+ n + " elements" );
        for (int i = 0; i< n; i++){
            arr[i]= sc.nextInt();
        }
        // int[] arr = {1,2,3,4,5}

        int max = arr[0];
        for (int i = 1; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max of arr elements : " + max );
    }
}

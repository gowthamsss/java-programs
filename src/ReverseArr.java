import java.util.Scanner;

public class ReverseArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements" );
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array of " + n + " elements");
        for (int i = 0; i< n; i++){
            arr[i]= sc.nextInt();
        }
        // without using temp var;
        int[] reversedArr = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
            reversedArr[i] = arr[i];
        }
        System.out.print(  " without using temp var " );
        for(int i = reversedArr.length - 1; i >= 0; i--){
            System.out.print( reversedArr[i]+ " " );
        }

        // with using temp var :
        int i = 0;
        int j = n -1;

        while(i < j) {
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
            i++;
            j--;
        }
        System.out.print('\n');
        System.out.print(  " with using temp var " );
        for(int k =0; k < arr.length; k++){
            System.out.print( arr[k]+ " " );
        }

    }
}

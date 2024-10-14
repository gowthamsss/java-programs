import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEvenNums {
    public static void main(String[] args) {
//        int[] arr = {5, 10, 4, 15, 8, 21, 3, 2};
//
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] % 2 != 0){
//                System.out.print(arr[i] + " ");
//            }
//        }


        //using ArrayList :

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter how many elements" );
        int n = sc.nextInt();
        System.out.println("Enter array of "+ n + " elements" );
        for(int i = 0; i < n; i++){
            list.add(i, sc.nextInt());
        }
        for(int i = list.size() - 1; i >= 0; i--){
            if(list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        System.out.print("Output : " + list + " ");
    }
}

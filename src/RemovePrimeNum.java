import java.util.ArrayList;

public class RemovePrimeNum {
    public static void main(String[] args) {
//        int[] arr = {728, 556, 783, 501, 768, 335, 641, 378, 745, 281, 768, 359, 896, 173, 329, 271, 658, 260, 528, 782, 381, 868, 866, 376, 227};
        int[] arr = {1, 2,3,4,5,6,7,8,9,10};
        removePrime(arr);

    }

    private static void removePrime(int[] A) {
        for(int i = 0; i < A.length; i++){
            boolean isPrime = true;

            if(A[i] <=0) isPrime = false;
            if(A[i] == 2) isPrime = true;

            for(int j = 2; j < A[i]; j++){
                if(A[i] % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(!isPrime){
                System.out.print(A[i] + " ");
            }

        }
    }
}

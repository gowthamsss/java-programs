public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4};
        int target = 5;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    System.out.println(i + "," + j);
                    flag = true;
                    break;  // Break the inner loop after finding the first match
                }
            }
            if(flag) break; // Break the outer loop if a pair is found
        }
    }
}

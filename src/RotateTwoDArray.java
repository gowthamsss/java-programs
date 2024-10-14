public class RotateTwoDArray {

    // Rotate 2D Array 90 degree:
    public static void main(String[] args) {

    int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}};
    // o/p :
    //13 9 5 1
    //14 10 6 2
    //15 11 7 3
    //16 12 8 4


    for(int i = 0; i< arr.length; i++){
        for(int j = i + 1; j < arr.length; j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }

    for(int k = 0; k< arr.length; k++){
        for(int j = arr.length - 1; j >= 0; j--){
            System.out.print(arr[k][j] + " ");
        }
        System.out.println();
    }
    }

}

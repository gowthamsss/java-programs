public class TransposeTwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        int[][] transPosedArr = new int[arr.length][arr[0].length];


        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                transPosedArr[j][i] = arr[i][j];
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(transPosedArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

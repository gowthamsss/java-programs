public class Fib {
    public static void main(String[] args) {
//        int n = 10;
//        int n1 = 0, n2 = 1, n3 = 0;
//        System.out.print(n1 + " " + n2);
//
//        for(int i = 2; i < n; i++){
//            n3 = n1 + n2;
//            System.out.print(" " +n3); // print n series number of fib
//            n1 = n2;
//            n2 = n3;
//        }
//        System.out.println();
//        System.out.println(n3); // print nth fib num

        int n = 10;
        for(int i = 0; i < n; i++) {
            int ans = isFib(i);
            System.out.println(ans);
        }
    }
    public static int isFib(int n) {
        int n1 = 0, n2 = 1, n3 = 0;
        if(n <= 0) return 0;
        if(n == 1) return 1;
        else{
        for(int i = 2; i <= n; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
       }
        return n3;
        }
//        if(n <= 0){
//            return 0;
//        }
//        if(n == 1){
//            return 1;
//        }
//        else {
//            return isFib(n - 1) + isFib(n - 2);
//        }
    }

}
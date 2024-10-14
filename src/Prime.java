public class Prime {
    public static void main(String[] args) {

        // ----------print the num is prime or not-----------
//        int n = 17;
//        int count = 2;
//        boolean isPrime = true;
//        while(count < n){
//            if(n % count == 0){
//                isPrime = false;
//                break;
//            }
//            else {
//                count++;
//            }
//        }
//        if(isPrime){
//            System.out.println(n + " is Prime");
//        }
//        else{
//            System.out.println(n + " is not Prime");
//        }


        //--------------print n number of prime ----------------
//        int n = 8;
//        for(int i = 2; i<=n; i++) {
//            boolean isPrime = true;
//            for(int j = 2; j<i; j++) {
//                    if (i % j == 0) {
//                        isPrime = false;
//                        break;
//                    }
//                }
//        if(isPrime) {
//            System.out.print(i + " ");
//        }
//        }

        //---------------print n prime num using fun call-----------------

        int n = 20;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

        static boolean isPrime(int n){
            int count  = 2;
            while(count < n){
                if(n % count == 0){
                    return false;
                }
                count++;
            }
        return true;
    }
}

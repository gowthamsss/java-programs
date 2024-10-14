public class ArmStrong {
    public static void main(String[] args) {
        int n = 153;

//        boolean ans = isArmStrong(n);
//        System.out.println(ans);

        for (int i = 0; i <= 20000; i++){
           if (isArmStrong(i)) {
            System.out.println(i);
            }

        }
    }

    static boolean isArmStrong(int n) {
        int temp = n;
        double sum = 0;
        int digits = 0, rem = 0;


        while(temp > 0){
            temp/=10;
            digits++;
        }
        temp = n;
        while (temp > 0)
        {
            rem = temp%10;
        sum = sum + Math.pow(rem, digits);
            temp/= 10;
        }
        if (sum == n){
            return true;
        }
        else {
            return false;
        }
    }
}

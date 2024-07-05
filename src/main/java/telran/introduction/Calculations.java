package telran.introduction;

public class Calculations {
    public static int sum(int op1, int op2){
        int res = op1 + op2; 
        return res;
    } 
    public static int multiply(int op1, int op2) {
        int resMultiply = op1 * op2;
        return resMultiply;
    }
    public static int divide(int op1, int op2) {
        int resDivide = op1 / op2; 
        return resDivide;
    }
    public static int subtract(int op1, int op2) {
        int resSubtract = op1 - op2;
        return resSubtract;
    }
    public static int sumOfDigits(int number) {
        int resSumOfDigits = 0;
        if (number != 0) { 
            while (number != 0) {
                resSumOfDigits += number % 10;
                number /= 10;
            }
        } else return 0;
        return Math.abs(resSumOfDigits);
    } 
    public static int maxDigit(int number){
        number = Math.abs(number);
        int resMaxDigit = 0;    
        int val;
        while (number != 0) {
            val = number % 10;
            resMaxDigit = Math.max(val, resMaxDigit);
            number /= 10;
        }
        return resMaxDigit;
    } 

    public static boolean isDividedOn(int number, int dividor) {
        if (dividor != 0 && number % dividor == 0) {
            return true;
        } else return false;
    }
}


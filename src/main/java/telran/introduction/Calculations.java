package telran.introduction;

public class Calculations {
    public static int sum(int op1, int op2) {
        return op1 + op2;
    }

    public static int multiply(int op1, int op2) {
        return op1 * op2;
    }

    public static int divide(int op1, int op2) {
        int resDivide = 0;
        if (op2 == 0) {
            if (op1 > 0)
                resDivide = Integer.MAX_VALUE;
            if (op1 < 0)
                resDivide = Integer.MIN_VALUE;
        } else 
            resDivide = op1 / op2;
            return resDivide;
        }

    public static int subtract(int op1, int op2) {
        return op1 - op2;
    }

    public static int sumOfDigits(int number) {
        int resSumOfDigits = 0;
        number = Math.abs(number);
        while (number != 0) {
            resSumOfDigits += number % 10;
            number /= 10;
        }    
        return resSumOfDigits;
    }

    public static int maxDigit(int number) {
        number = Math.abs(number);
        int resMaxDigit = 0;
        while (number != 0) {       
            resMaxDigit = Math.max(number % 10, resMaxDigit);
            number /= 10;
        }
        return resMaxDigit;
    }

    public static boolean isDividedOn(int number, int dividor) {
        return dividor != 0 && number % dividor == 0;
    }
}

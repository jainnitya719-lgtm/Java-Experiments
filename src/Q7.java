public class Q7 {
}
class Number {
    private double num;

    Number(double num) {
        this.num = num;
    }

    boolean isZero() {
        return num == 0;
    }

    boolean isPositive() {
        return num > 0;
    }

    boolean isNegative() {
        return num < 0;
    }

    boolean isOdd() {
        return num % 2 != 0;
    }

    boolean isEven() {
        return num % 2 == 0;
    }

    boolean isPrime() {
        if (num < 2 || num != (int) num)
            return false;

        for (int i = 2; i < num; i++) {
            if ((int) num % i == 0)
                return false;
        }

        return true;
    }

    boolean isArmstrong() {
        int n = (int) num;
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Number n = new Number(153);

        System.out.println("Zero = " + n.isZero());
        System.out.println("Positive = " + n.isPositive());
        System.out.println("Negative = " + n.isNegative());
        System.out.println("Odd = " + n.isOdd());
        System.out.println("Even = " + n.isEven());
        System.out.println("Prime = " + n.isPrime());
        System.out.println("Armstrong = " + n.isArmstrong());
    }
}

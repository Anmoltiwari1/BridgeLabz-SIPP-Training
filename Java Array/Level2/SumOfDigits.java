public class SumOfDigits {

    public int get4DigitRandomNumber() {
        return (int)(Math.random() * 9000) + 1000;
    }

    public int countDigits(int number) {
        int count = 0, temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfDigits obj = new SumOfDigits();
        int number = obj.get4DigitRandomNumber();
        System.out.println("Random Number: " + number);

        int digitCount = obj.countDigits(number);
        int[] digits = obj.getDigits(number, digitCount);
        int sum = obj.sumOfDigits(digits);

        System.out.println("Sum of digits: " + sum);
    }
}

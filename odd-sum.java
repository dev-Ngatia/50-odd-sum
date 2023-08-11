public class SumOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;

        while (number <= 50) {
            sum += number;
            number += 2;
        }

        System.out.println("Sum of odd numbers from 1 to 50: " + sum);
    }
}

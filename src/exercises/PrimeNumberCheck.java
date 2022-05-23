package exercises;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println(isPrime(10));
    }

    public static boolean isPrime(int number) {
        int count = 0;
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        return count == 0;
    }
}

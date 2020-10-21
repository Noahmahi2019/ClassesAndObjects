public class Main {

    public static void main(String[] args) {

        int[] numbers = {3, 7, 9, 11};
        System.out.println(isPrime(numbers.length));
    }
        public static boolean isPrime(int number) {
             if (number <= 1)
        for (int i = 2; i < number; i++) {
            if (number % i == 0 )
                return false;
        }
                return true;
        }
    }
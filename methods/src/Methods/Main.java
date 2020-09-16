package Methods;

public class Main {


    public static void main(String[] args) {

        int[] arrayNumbers = {7, 9, 30, 20};
        getAverage(arrayNumbers);
    }

    public static void getAverage(int arrayNumbers[]) {

        int sum = 0;
        float length = 0;
        float  average = 0;

        for (int i = 0; i < arrayNumbers.length; i++)
            sum = sum + arrayNumbers[i];

        length =arrayNumbers.length;
        average =sum/length;

        System.out.println(average);
    }
}

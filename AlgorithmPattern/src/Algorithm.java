public class Algorithm {


    public static void main(String[] args) {
        patternTriangle(20);
        int t = 5;
    }

    public static void patternTriangle(int t) {
        int i, j;
        for (i = 0; i < t; i++) {

            for (j = 2 * (t - i); j <= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

}
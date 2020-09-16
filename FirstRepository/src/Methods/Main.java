package Methods;

public class Main {

    public static void main(String[] args) {

             double[] costsOfitems = {25.99, 30.50, 50.25, 80.55};
            itemPrices(costsOfitems);
        }

        public static void itemPrices ( double price[]){
            double sum = 0;
            for (int i = 0; i < price.length; i++)
                sum = sum + price[i];
            System.out.println(sum);
        }

    }



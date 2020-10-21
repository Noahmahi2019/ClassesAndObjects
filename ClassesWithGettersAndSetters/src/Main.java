import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User jayceDelgado = new User("jayce", "Delgado", "jayceDelgado1", "gfyhgyhg&&jj");
        User leonelBenton = new User("leonel", "Benton", "leonelBenton2", "buhsdsggy89");


        System.out.println(jayceDelgado.getFirstName());
        System.out.println(leonelBenton.getFirstName());

        Scanner input = new Scanner(System.in);
        jayceDelgado.setPassWord("~`!@#$%^&*");
        System.out.println(jayceDelgado.getPassword());
        leonelBenton.setPassWord("&*()-_=+|[");
        System.out.println(leonelBenton.getPassword());

    }
}
import java.util.Scanner;

public class HelloVar {

    public static void main (String[] args) {

        String name = "Patrick";
        String achternaam = "Smalen";
        int leerjaar = 1;
        double getal = 2.2;

        System.out.println(name + " " + achternaam);

        System.out.println("Hello Variables");

        Scanner scan = new Scanner(System.in);
        name = scan.next();
        System.out.println(name) ;




    }

}
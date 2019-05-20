import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       Calculation calc = new Calculation();

        System.out.println("Podaj pierwszą liczbę całkowitą ");
        int number1 = scan.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą ");
        int number2 = scan.nextInt();
        scan.close();
        int result = calc.comparator(number1,number2);
        System.out.println(result);







    }

}

import java.util.Scanner;

public class TesteEntrada1{
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Digite um inteiro:");
        int a = input.nextInt();
        System.out.println("voce digitou " + a);
        System.out.println("digite um real: ");
        double x = input.nextDouble();
        System.out.println("voce digitouu " + x);
        input.close();
    }
}

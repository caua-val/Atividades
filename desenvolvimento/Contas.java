import java.util.Scanner;

public class Contas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int numero = scanner.nextInt();
        scanner.close();
        int dobro = numero * 2;
        int quadrado = numero * numero;
        int sucessor = (numero + 1);
        System.out.println("o seu numero é: " + numero);
        System.out.println("o dobro do numero é: " + dobro);
        System.out.println("o quadrado deste numero é: " + quadrado);
        System.out.println("o sucessor deste numero é: " + sucessor);
    }
}

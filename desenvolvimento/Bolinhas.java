import java.util.Scanner;

public class Bolinhas {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o raio: ");
        double raio = scanner.nextDouble();
        scanner.close();
        double comprimento = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        double volume = 4.0 / 3.0 * Math.PI * Math.pow(raio, 3);
        System.out.println("o comprimento do radio é: " + comprimento + "a area é: " + area + "e o volume: " + volume);

        System.out.printf("comprimento = %.3f\n area = %.3f\n volume = %.3f\n", comprimento, area, volume);
    }
}


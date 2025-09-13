import java.util.Scanner;

public class MaiorOuIguais {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("DIgite o segundo numero: ");
        double num2 = scanner.nextDouble();

        scanner.close();

        if(num1 == num2){
            System.out.println("Os numeros sao iguais");
        }
        else if(num1 > num2){
            System.out.println("O numero "+ num1 +" e o maior");
        }
        else{
            System.out.println("o numero "+ num2 +" e o maior");
        }

    }
    
}

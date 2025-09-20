import java.util.Scanner;

public class Baskara {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        System.out.println("Digite A: ");
        a = scanner.nextDouble();
        System.out.println("Digite B: ");
        b = scanner.nextDouble();
        System.out.println("Digite C: ");
        c = scanner.nextDouble();
        scanner.close();

        if (a == 0) {
            System.out.print("A equacao nao e de segundo grau");
        }
        else{
            delta = b*b-4*a*c;
            if(delta < 0){
                System.out.print("O numero nao tem raiz real");
            }
            else if(delta > 0){
                x1 = (-b - Math.sqrt(delta))/(2*a);
                x2 = (-b + Math.sqrt(delta))/(2*a);

                System.out.println("O resultado da equacao e igual a "+ x1 +" ou "+ x2);
            }
            else{ //delta igual a zero
                x1 = -b / (2*a);
                System.out.println("raiz unica igual a " + x1);
            }
        }
    }
}

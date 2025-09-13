import java.util.Scanner;

public class MediaDasNotas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        scanner.close();
        
        double media = nota1 + nota2 / 2;


        if(media<2){
            System.out.println("Aluno reprovado");
        }
        else if(media>6){
            System.out.println("Aluno aprovado");
        }
        else {
            System.out.println("Necessita da P3");
        }

    }
}

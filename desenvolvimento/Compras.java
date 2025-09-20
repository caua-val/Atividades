import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in);
    double produto, opcao, formapagamento;

    System.out.println("Qual o valor do produto? ");
    produto = scanner.nextDouble();
    System.out.println("Digite o valor da forma de pagamento que voce deseja: \n1. A vista \n2. A prazo");
    opcao = scanner.nextDouble();

    if(opcao == 1){
        System.out.println("Voce deseja pagar: \n1. Com boleto \n2. Com pix (Desconto de 5%)");
        formapagamento = scanner.nextDouble();

                if(formapagamento == 1){
            System.out.print("Valor dos produtos: R$"+ produto +"\nValor a pagar: R%"+ produto);
            }
                else if(formapagamento == 2){
            System.out.print("Valor dos produtos: R$"+ produto +"\nValor a pagar: R$"+ (produto-(produto/100*5)));
            }
                else{
            System.out.print("Opcao invalida.");
            }

    }
    else if(opcao == 2){
        System.out.println("Quantas parcelas voce deseja: \n2 parcelas \n3 parcelas");
        formapagamento = scanner.nextDouble();

            if(formapagamento == 2){
                System.out.print("Valor dos produtos: R$"+ produto +"\nValor a pagar: R$"+ (produto+(produto/100*5)) + " acrescido 5%");
            }
            else if (formapagamento == 3){
                System.out.print("Valor dos produtos: R$"+ produto +"\nValor a pagar: R$"+ (produto+(produto/100*10)) + " acrescido 10%");

            }
            else{
                System.out.print("Opcao invalida.");
            }
    }
    else{
        System.out.print("Opcao invalida.");
    }

    scanner.close();
    }

}

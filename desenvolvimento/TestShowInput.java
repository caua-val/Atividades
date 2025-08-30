
import javax.swing.JOptionPane;

//ler valores de tipos diferentes para test
public class TestShowInput {
    public static void main(String[] args){
        String s;
        s = JOptionPane.showInputDialog("digite seu nome: ");
        JOptionPane.showMessageDialog(null, "ja sei o seu nome: " + s);
        s = JOptionPane.showInputDialog( "digite um inteiro");
        int i = Integer.parseInt(s);
        JOptionPane.showMessageDialog(null, "o dobro do valor é: " + 2 * i);
        s = JOptionPane.showInputDialog(null, "digite um ponto flutuante: ");
        double d = Double.parseDouble(s);
        JOptionPane.showMessageDialog(null, "a raiz desse valor é " + Math.sqrt(d));
    }
}


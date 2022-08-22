import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        int num1, num2, num3, soma;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° numero"));

        soma = (num1 + num2 +  num3) ;

        JOptionPane.showMessageDialog(null, "A soma de" + num1 + "," + num2 + "e" + num3 + "é" + soma);

    }
}

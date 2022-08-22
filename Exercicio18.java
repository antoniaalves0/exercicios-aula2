import javax.swing.JOptionPane;

public class Exercicio18 {
    public static void main(String[] args) {
        double valorReal, cotacao, valorDolar;
        valorReal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em real: "));
        cotacao = Double.parseDouble(JOptionPane.showInputDialog("digite a cotação do dolar: "));

        valorDolar = valorReal * cotacao;

        JOptionPane.showMessageDialog(null, "voce tem U$" + valorDolar);


    }
}

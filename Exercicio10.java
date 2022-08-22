import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        double preco, desconto, precoNovo;
        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));

        desconto = preco *  0.1;
        precoNovo = preco - desconto;

        JOptionPane.showMessageDialog(null, "O preço do produto com desconto e R$" + precoNovo);
    }
}

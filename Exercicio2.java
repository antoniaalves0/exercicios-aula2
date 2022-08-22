import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        if (idade >= 18){
            JOptionPane.showMessageDialog(null, "Vc e maior de idade");
        }
        else {
            JOptionPane.showMessageDialog(null, "Vc e menor de idade");

        }
    }
}

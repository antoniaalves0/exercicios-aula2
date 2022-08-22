import javax.swing.JOptionPane;
public class Exercicio1 {
    public static void main(String[] args) {
        float salario;
        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salario: "));
        if (salario >= 1212) {
            JOptionPane.showMessageDialog(null, "Vc esta ganhando pelo menos um salario minino");
        }
        else {
            JOptionPane.showMessageDialog(null, "Vc NAO esta ganhando um salario minino");

        }
    }
}
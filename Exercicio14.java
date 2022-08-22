import javax.swing.JOptionPane;
public class Exercicio14 {
    public static void main(String[] args) {
        double num1, num2;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("digite o 1° numero: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("digite o 2° numero: "));

        if (num1 >= num2){
            JOptionPane.showMessageDialog(null, "O numero maior é " + num1);
        }
        else {
            JOptionPane.showMessageDialog(null, "O numero maior é " + num2);

        }


    }
}

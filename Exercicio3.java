import javax.swing.JOptionPane;
public class Exercicio3 {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));

        if (num%2==0){
            JOptionPane.showMessageDialog(null, "O número é Par ");
        }
        else{
            JOptionPane.showMessageDialog(null, "O número é Impar");

        }
    }
}

import javax.swing.JOptionPane;

public class Exercicio19 {
    public static void main(String[] args) {
        int num, antecessor, sucessor;
        num = Integer.parseInt(JOptionPane.showInputDialog("digite um numero inteiro:"));

        antecessor = num - 1;
        sucessor = num + 1;

        JOptionPane.showMessageDialog(null, "O antecessor de " + num + "é" + antecessor+ "e o sucessor é" +  sucessor);
    }
}

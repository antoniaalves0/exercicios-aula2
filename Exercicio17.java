import javax.swing.JOptionPane;

public class Exercicio17 {
    public static void main(String[] args) {
        double tempC, tempF;
        tempC = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite uma temperatura em graus Celsius: "));

        tempF = tempC * (9.00 / 5.00) + 32.00 ;

        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + tempF + "F ");

    }
}

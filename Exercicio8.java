import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args) {
        double raio, area;
        raio = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do raio do circulo:"));

        area = 3.14 * (raio * raio);

        JOptionPane.showMessageDialog(null, "A area do circulo é " + area);

    }
}

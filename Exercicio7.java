import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        double base, altura, area;
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triangulo:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura"));

        area = (base * altura) / 2;

        JOptionPane.showMessageDialog(null, "a area do triangulo e "  + area);
    }
}

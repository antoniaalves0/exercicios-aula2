import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        double nota1, nota2 , nota3, media; 
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("digite a 1° nota"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("digite a 2° nota"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("digite a 3° nota"));

        media = ( nota1 + nota2 + nota3) / 3; 

        JOptionPane.showMessageDialog(null, "a media aritmetica é "  + media);
    }
}

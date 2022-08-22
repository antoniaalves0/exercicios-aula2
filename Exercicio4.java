import javax.swing.JOptionPane;
public class Exercicio4 {
    public static void main(String[] args) {
        double altura;
        char sexo;
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
        sexo = JOptionPane.showInputDialog("Digite seu sexo:").charAt(0);
       
        if(sexo == 'f') {
            JOptionPane.showMessageDialog(null, "Seu peso ideal é" + ((62.1 * altura) - 44.7)
            );
        } else if (sexo == 'm') {
            JOptionPane.showMessageDialog(null, "Seu peso ideal é" +  ((62.1 * altura) - 44.7));
        } else{
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }
}

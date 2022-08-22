import javax.swing.JOptionPane;

public class Exercicio21 {
    public static void main(String[] args) {
        double ano;

        ano = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano: "));

        if (ano % 400 == 0 ){
            JOptionPane.showMessageDialog(null, "O ano e bissexto");
        } else if (ano %4 == 0) {
            JOptionPane.showMessageDialog(null, "O ano e bissexto");

        } else if (ano % 100 != 0){
            JOptionPane.showMessageDialog(null, "O ano e bissexto");
        } else{
            JOptionPane.showMessageDialog(null, "O ano NAO é bissexto");
        }
    }
}

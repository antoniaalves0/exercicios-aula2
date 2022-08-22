import javax.swing.JOptionPane;

public class Exercicio20 {
    public static void main(String[] args) {
        int num ;
        num = Integer.parseInt(JOptionPane.showInputDialog("digite um numero entre 1 e 7:"));

        switch (num){
            case 1:
            JOptionPane.showMessageDialog(null, "Domingo");
            break;

            case 2:
            JOptionPane.showMessageDialog(null, "segunda");
            break;
            
            case 3:
            JOptionPane.showMessageDialog(null, "terça");
            break;

            case 4:
            JOptionPane.showMessageDialog(null, "quarta");
            break;

            case 5:
            JOptionPane.showMessageDialog(null, "quinta");
            break;

            case 6:
            JOptionPane.showMessageDialog(null, "sexta");
            break;

            case 7:
            JOptionPane.showMessageDialog(null, "sabado");
            break;

        }
    }
}

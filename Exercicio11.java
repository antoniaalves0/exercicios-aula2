import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        double salarioBase, salarioNovo, imposto, gratificacao;
        salarioBase = Double.parseDouble(JOptionPane.showInputDialog("digite o salario base do funcionario:"));

        gratificacao =  salarioBase * 0.5 ;
        imposto  = salarioBase * 0.7 ;
        salarioNovo = salarioBase + gratificacao - imposto; 

        JOptionPane.showMessageDialog(null,"O salario a rEceber é R$" + salarioNovo);

        
    }
}

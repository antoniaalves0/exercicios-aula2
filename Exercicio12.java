import javax.swing.JOptionPane;

public class Exercicio12 {
    public static void main(String[] args) {
        double salario, percentual,  valorAumento, salarioNovo; 
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salario:"));
        percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de aumento:"));

        valorAumento = percentual / 100 ;
        salarioNovo = salario * valorAumento;

        JOptionPane.showMessageDialog(null, "O novo salário é R$" + salarioNovo);


    }
}

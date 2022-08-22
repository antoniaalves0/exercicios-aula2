import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        double num, numQuadrado, numCubo, numRaiz;
        num =   Double.parseDouble(JOptionPane.showInputDialog("digite um numero positivo"));

        numQuadrado =   num * num;
        numCubo = num * num * num;
        numRaiz = Math.sqrt(num);

        JOptionPane.showMessageDialog(null, "O numero digitado ao quadrado é" + numQuadrado);
        JOptionPane.showMessageDialog(null, "O numero digitado ao cubo é" + numCubo);
        JOptionPane.showMessageDialog(null, " A raiz quadrada do numero digitado é"+ numRaiz);


    }
}

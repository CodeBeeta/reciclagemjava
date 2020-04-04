package fundamentos;

import javax.swing.JOptionPane;

public class DesafioModulo {
	public static void main(String[] args) {
		double resultado;
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro Numero"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo Numero"));
		String operacao = JOptionPane.showInputDialog("Qual a Operação que deseja? || + - * / %");
		
		resultado = (operacao.equals("+"))?(n1+n2):(operacao.equals("-"))?(n1-n2):(operacao.equals("*"))?(n1*n2):
			(operacao.equals("/"))?(n1/n2):(n1%n2);
			
			JOptionPane.showMessageDialog(null, "TADA!! Resultado é: "+resultado);
	
		
	}

}

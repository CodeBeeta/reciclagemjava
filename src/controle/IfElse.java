package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Informe um numero:");
		int numero = Integer.parseInt(valor);

		if (numero % 2 == 0) {
			System.out.println("N�mero Par");
		} else {
			System.out.println("N�mero �mpar");
		}

	}
}

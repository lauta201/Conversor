
import java.awt.Component;

import javax.swing.JOptionPane;

public class Moneda {

	private static final Component Component = null;

	public static void main(String[] args) {
		float valor = 0;
		Menu menu = new Menu();
		String selecValor;
		
		Object[] selecMoneda = { "de Pesos Argentinos a Euros", "de Pesos Argentinos a Dolares",
				"de Pesos Argentinos a Yuanes", "de Pesos Argentinos a Libras", "de Pesos Argentinos a Won surcoreano", "de Dolares a pesos Argentinos", "de Euros a pesos Argentinos", "de Yuanes a pesos Argentinos", "de Libras a pesos Argentinos", "de Won surcoreano a pesos Argentinos" };

		selecValor = (String) JOptionPane.showInputDialog(null, "Elige a que moneda deseas convertir", "Input",
				JOptionPane.INFORMATION_MESSAGE, null, selecMoneda, selecMoneda[0]);

		switch (selecValor) {
		case "de Pesos Argentinos a Euros":
			try {
				valor = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese el valor de los Pesos que desa convertir"));
				float cambio = (float) (valor / 557.00);
				JOptionPane.showMessageDialog(null, valor + " Pesos Argentinos son: " + cambio + " Euros");
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Valor no valido, solo se admiten Numeros");
			} finally {

				menu.queHacer();
				break;
			}
		case "de Pesos Argentinos a Dolares":
			try {
				valor = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese el valor de los Pesos que desa convertir"));
				float cambio = (float) (valor / 520.00);
				JOptionPane.showMessageDialog(null, valor + " Pesos Argentinos son: " + cambio + " Dolares");
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Valor no valido, solo se admiten Numeros");
			} finally {
				menu.queHacer();
				break;
			}
		case "de Pesos Argentinos a Yuanes":
			try {
				valor = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese el valor de los Pesos que desa convertir"));
				float cambio = (float) (valor / 500);
				JOptionPane.showMessageDialog(null, valor + " Pesos Argentinos son: " + cambio + " Yuanes");
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Valor no valido, solo se admiten Numeros");
			} finally {
				menu.queHacer();
				break;
			}
		case "de Pesos Argentinos a Libras":
			try {
				valor = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese el valor de los Pesos que desa convertir"));
				float cambio = (float) (valor / 500.00);
				JOptionPane.showMessageDialog(null, valor + " Pesos Argentinos son: " + cambio + " Libras");
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Valor no valido, solo se admiten Numeros");
			} finally {
				menu.queHacer();
				break;
			}
			
		case "de Pesos Argentinos a Won surcoreano":
			try {
				valor = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese el valor de los Pesos Argentinos que desa convertir"));
				float cambio = (float) (valor * 2.44);
				JOptionPane.showMessageDialog(null, valor + " Pesos Argentinos son: " + cambio + " Wones surcoreanos");
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Valor no valido, solo se admiten Numeros");
			} finally {
				menu.queHacer();
				break;
			}
			
		case "de Dolares a pesos Argentinos":
			try {
				valor = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese el valor de los Pesos Argentinos que desa convertir"));
				float cambio = (float) (valor * 520);
				JOptionPane.showMessageDialog(null, valor + " Dolares son:  " + cambio + " Pesos Argentinos");
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Valor no valido, solo se admiten Numeros");
			} finally {
				menu.queHacer();
				break;
			}
		case "de Euros a pesos Argentinos":
			try {
				valor = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese el valor de los Pesos Argentinos que desa convertir"));
				float cambio = (float) (valor * 567);
				JOptionPane.showMessageDialog(null, valor + " Euros son:  " + cambio + " Pesos Argentinos");
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Valor no valido, solo se admiten Numeros");
			} finally {
				menu.queHacer();
				break;
			}
		case "de Yuanes a pesos Argentinos":
			try {
				valor = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese el valor de los Pesos Argentinos que desa convertir"));
				float cambio = (float) (valor * 70.52);
				JOptionPane.showMessageDialog(null, valor + " Yuanes son:  " + cambio + " Pesos Argentinos");
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Valor no valido, solo se admiten Numeros");
			} finally {
				menu.queHacer();
				break;
			}
		case  "de Libras a pesos Argentinos":
			try {
				valor = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese el valor de los Pesos Argentinos que desa convertir"));
				float cambio = (float) (valor * 660);
				JOptionPane.showMessageDialog(null, valor + " Libras son:  " + cambio + " Pesos Argentinos");
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Valor no valido, solo se admiten Numeros");
			} finally {
				menu.queHacer();
				break;
			}
		case "de Won surcoreano a pesos Argentinos":
			try {
				valor = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese el valor de los Pesos Argentinos que desa convertir"));
				float cambio = (float) (valor * 0.40);
				JOptionPane.showMessageDialog(null, valor + " Wones surcoreanos son:  " + cambio + " Pesos Argentinos");
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Valor no valido, solo se admiten Numeros");
			} finally {
				menu.queHacer();
				break;
			}
		
			

		}

	}
	
	
	
}

//valor =Integer.parseInt(JOptionPane.showInputDialog("A que moneda desea cambiar?"));
//System.out.println(valor = valor + 5);  NumberFormatException
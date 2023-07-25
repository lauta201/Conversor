import javax.swing.JOptionPane;

public class Temperatura {
	public static void main(String[] args) {
		double valor = 0;
		Menu mn = new Menu();

		String opciones = (String) JOptionPane.showInputDialog(null, "Elige de que Grado deseas convertir",
				"Temperatura", JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Grados Fahrenheit", "Grados Kelvin", "Grados Celsius" }, null);

		if (opciones == "Grados Celsius") {

			String opc = (String) JOptionPane.showInputDialog(null, "Elige de ° Celsius a que Grado deseas convertir",
					"Temperatura", JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Grados Fahrenheit", "Grados Kelvin", }, null);

			switch (opc) {
			case "Grados Fahrenheit":
				try {
					valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de los °C"));
					double gradovalor = ((valor * 1.8) + 32);
					JOptionPane.showMessageDialog(null, valor + "° Celsius son: " + gradovalor + "° Fahrenheit");

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Solo se admiten Numeros");
				} finally {
					mn.queHacer();
					break;
				}
			case "Grados Kelvin":
				try {
					valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de los °C"));
					double gradovalor = (valor + 273.15);
					JOptionPane.showMessageDialog(null, valor + "° Celsius son: " + gradovalor + "° kelvin");
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Solo se admiten Numeros");
				} finally {
					mn.queHacer();
					break;
				}
			}

		}else if (opciones == "Grados Fahrenheit") {
			String opc = (String) JOptionPane.showInputDialog(null, "Elige de ° Fahrenheit a que Grado deseas convertir",
					"Temperatura", JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Grados Celsius", "Grados Kelvin", }, null);
			
			switch (opc) {
			case "Grados Celsius":
				try {
					valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de los °F"));
					double gradovalor = ((valor -32) * 5/9);
					JOptionPane.showMessageDialog(null, valor + "° Fahrenheit son: " + gradovalor + "° Celsius");

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Solo se admiten Numeros");
				} finally {
					mn.queHacer();
					break;
				}
			case "Grados Kelvin":
				try {
					valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de los °F"));
					double gradovalor =  (valor - 32) * 5/9 + 273.15;
					JOptionPane.showMessageDialog(null, valor + "° Fahrenheit son: " + gradovalor + "° kelvin");
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Solo se admiten Numeros");
				} finally {
					mn.queHacer();
					break;
				}
			}
		}else if (opciones == "Grados Kelvin") {
			String opc = (String) JOptionPane.showInputDialog(null, "Elige de ° Kelvin a que Grado deseas convertir",
					"Temperatura", JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Grados Fahrenheit", "Grados Celsius", }, null);

			switch (opc) {
			case "Grados Fahrenheit":
				try {
					valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de los °K"));
					double gradovalor =((valor * 273.15) * 9/5 + 32);
					JOptionPane.showMessageDialog(null, valor + "° Kelvin son: " + gradovalor + "° Fahrenheit");

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Solo se admiten Numeros");
				} finally {
					mn.queHacer();
					break;
				}
			case "Grados Celsius":
				try {
					valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de los °K"));
					double gradovalor =(valor - 273.15);
					JOptionPane.showMessageDialog(null, valor + "° kelvin son: " + gradovalor + "° Celsius");
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Solo se admiten Numeros");
				} finally {
					mn.queHacer();
					break;
				}
			}
		}
	}
}


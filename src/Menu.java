import javax.swing.JOptionPane;

public class Menu {
	public static void main(String[] args) {

		Moneda cm = new Moneda();
		Temperatura ct = new Temperatura();
		Object[] selecOpcion = { "Conversor de Moneda", "Conversor de Temperatura" };
		Object opciones = JOptionPane.showInputDialog(null, "Elige que deseas convertir", "Conversor",
				JOptionPane.INFORMATION_MESSAGE, null, selecOpcion, selecOpcion[0]);

		if (opciones == "Conversor de Moneda") {
			cm.main(args);
		} else if (opciones == "Conversor de Temperatura") {
			ct.main(args);
		}

	}

	public static void queHacer() {
		
		Object[] opciones = { "Si", "No", "Cancelar" };
		int seleccion = JOptionPane.showOptionDialog(null, "¿Desea Continuar?", "Aviso",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		
		System.out.println(seleccion);
		if (seleccion == 0) {
			main(null);
		}else if(seleccion == 1) {
			JOptionPane.showInternalMessageDialog(null, "Programa finalizado",
		             "Conversor", JOptionPane.INFORMATION_MESSAGE);
			
		}else if(seleccion == 2) {
			JOptionPane.showInternalMessageDialog(null, "Programa finalizado",
		             "Conversor", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}

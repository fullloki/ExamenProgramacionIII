package principal;
import bankGUI.*;
import appGUI.*;
/**
 * EXAMEN PROGRAMACION III, SEMESTRE 2,2023 
 * INTEGRANTES:
 * @author Antonio Cortes 8-1003-690
 * @author Jeremy Gonzalez 8-971-1073
 * @author Pamela Vallejo 8-1008-1973
 * @author Asbel Jaen 8-1006-1733
 * Calificacion: 100
 * Fecha: 6/12/2023
 * */
public class Main {
	
	public static void main(String[] args) {
		FrameMain app = new FrameMain("LA CABAÑITA");
		app.setSize(1050, 590);
		app.setVisible(true);
		app.setResizable(false);
		app.setLocationRelativeTo(null);
	}
}

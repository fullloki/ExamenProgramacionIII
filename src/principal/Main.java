package principal;
import java.awt.Color;

import appGUI.*;
public class Main {

	public static void main(String[] args) {
		FrameMain fm = new FrameMain("the program");
		fm.setSize(1050, 590);
		fm.setVisible(true);
		fm.setResizable(false);
		fm.setBackground(Color.BLACK);
		System.out.println("el cambio");
	}

}

package Calculator;

import Window.*;
import javax.swing.SwingUtilities;
import Numbers.*;


public class Dispacher {
	 
public static void main (String [] args) {
		
		
	

		WindowApp app = new WindowApp();

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WindowApp();
			}
		});
		app.setVisible(true); // виводимо наше вікно

}

}

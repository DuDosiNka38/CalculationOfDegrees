package Window;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class WindowApp extends JFrame {

	private ConsolePanel console;
	private FormPanel form;
	private JButton Exit;


	public WindowApp() {
		super("DegreeCalculator");
		setBounds(900, 120, 450, 400);

		console = new ConsolePanel();
		form = new FormPanel();
		Exit = new JButton("Exit");


		form.setFormListener(new FormListener() {
			public void formEventOccured(FormEvent ev) {

				String FirstNumber = ev.getFirstNumber();
				String CommonRatio = ev.getCommonRatio();
				String NumberOfTerms = ev.getNumberOfTerms();

				if (FormEvent.isNumeric(FirstNumber) && FormEvent.isNumeric(CommonRatio) && FormEvent.isNumeric(NumberOfTerms)) {

					int k = Integer.parseInt(NumberOfTerms);
					double x = Double.parseDouble(CommonRatio);
					double n = Double.parseDouble(FirstNumber);
					console.appendText("\n");
					console.appendText(" n       x " + "\n");
					for (int i = 0; i < k; i++) {
						double answer = Math.pow(x, n);
						console.appendText(" " + Math.round(n) + ";       " + answer + ";   " + "\n");
						n++;
					}
				} else {
					console.appendText("Помилка при введенні числа.\nСпробуйте ще раз." + "\n");
				}
			}

		});

		add(console, BorderLayout.CENTER);
		add(form, BorderLayout.WEST);
		add(Exit, BorderLayout.SOUTH);

		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

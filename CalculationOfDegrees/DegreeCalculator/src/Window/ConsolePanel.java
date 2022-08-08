package Window;

import java.awt.*;
import javax.swing.*;

public class ConsolePanel extends JPanel {

	public JTextArea textArea;

	public void Clear() {
		textArea.setText(null);
	}

	public void appendText(String text) {
		textArea.append(text);
	}

	public ConsolePanel() {
		textArea = new JTextArea();
		setLayout(new BorderLayout());
		JScrollPane scrollPane = new JScrollPane(textArea);

		add(scrollPane, BorderLayout.CENTER);
	}

}

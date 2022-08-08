package Window;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormPanel extends JPanel {

	private JLabel FirstNumber, CommonRatio, NumberOfTerms;
	public JTextField FirstNumberField, CommonRatioField, NumberOfTermsField;
	private JButton Compute, Erase;

	private FormListener formListener;

	public void setFormListener(FormListener listener) {
		this.formListener = listener;
	}

	public void Clear() {
		FirstNumberField.setText(null);
		CommonRatioField.setText(null);
		NumberOfTermsField.setText(null);

	}

	FormPanel() {
		Dimension dim = this.getPreferredSize();
		dim.width = 220;
		setPreferredSize(dim);

		FirstNumber = new JLabel("First Number");
		CommonRatio = new JLabel("Common Ratio");
		NumberOfTerms = new JLabel("Number of Terms");

		Compute = new JButton("Compute");
		Erase = new JButton("Erase");

		FirstNumberField = new JTextField(10);
		CommonRatioField = new JTextField(10);
		NumberOfTermsField = new JTextField(10);

		Erase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clear();

			}
		});

		Compute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String FirstNumber = FirstNumberField.getText();
				String CommonRatio = CommonRatioField.getText();
				String NumberOfTerms = NumberOfTermsField.getText();
				FormEvent ev = new FormEvent(this, FirstNumber, CommonRatio, NumberOfTerms);

				if (formListener != null)
					formListener.formEventOccured(ev);
			}
		});

		GridBagLayout layout = new GridBagLayout();
		setLayout(layout);

		GridBagConstraints gc = new GridBagConstraints();

		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		add(FirstNumber, gc);

		gc.gridx = 1;
		gc.gridy = 0;
		add(FirstNumberField, gc);

		gc.gridx = 0;
		gc.gridy = 1;
		add(CommonRatio, gc);

		gc.gridx = 1;
		gc.gridy = 1;
		add(CommonRatioField, gc);

		gc.gridx = 0;
		gc.gridy = 2;
		add(NumberOfTerms, gc);

		gc.gridx = 1;
		gc.gridy = 2;
		add(NumberOfTermsField, gc);

		gc.gridx = 0;
		gc.gridy = 3;
		add(Compute, gc);

		gc.gridx = 1;
		gc.gridy = 3;
		add(Erase, gc);

	}

}

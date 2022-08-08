package Window;

import java.util.EventObject;



public class FormEvent extends EventObject {

	String FirstNumber, CommonRatio, NumberOfTerms;

	public FormEvent(Object source) {
		super(source);

	}

	public FormEvent(Object source, String FirstNumber, String CommonRatio, String NumberOfTerms) {
		super(source);
		this.FirstNumber = FirstNumber;
		this.CommonRatio = CommonRatio;
		this.NumberOfTerms = NumberOfTerms;
	}

	public String getFirstNumber() {
		return FirstNumber;
	}

	public String getCommonRatio() {
		return CommonRatio;
	}

	public String getNumberOfTerms() {
		return NumberOfTerms;
	}

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}

package week3day2;

public class Elements  extends Button{
	
	public static void main(String[] args) {
		
		Elements elem = new Elements();
		//WebElement class methods
		elem.click();
		elem.setText("Hello World");
		
		//Button methods
		elem.submit();
		
		//TextField Methods
		TextField tf = new TextField();
		tf.getText();
		
		//CheckBoxButton Methods
		CheckBoxButton cbb = new CheckBoxButton();
		cbb.clickCheckButton();
		
		//RadioButton Methods
		RadioButton rb = new RadioButton();
		rb.selectRadioButton();		
		
	}

}

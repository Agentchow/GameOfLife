package a8;

public class Controller {
	
	private Model model;
	private int test;
	private View view;
	private int but;
	
	public Controller (Model model, View view) {
		this.model = model;
		this.view = view;
		
		
		
	}
	public void setButton (String name) {
		model.setName(name);
	}
	
	public void setIterationNumber (int i) {
		model.setIterationNumber();
	}
	
}	

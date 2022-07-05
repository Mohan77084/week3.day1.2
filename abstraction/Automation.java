package abstraction;

public class Automation extends MultipleLanguage implements Language, TestTool  {

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Learn Selenium");
	}

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Learn Java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Learn Ruby");
	}
public static void main(String[] args) {
	Automation automation = new Automation();
	automation.selenium();
	automation.java();
	automation.ruby();
	automation.python();
}
}

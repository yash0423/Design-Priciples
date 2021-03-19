package designPrinciple.facadePattern;

public class FacadePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeMaker smf = new ShapeMaker();
		
		//Call the draw methods
		smf.drawCircle();
		smf.drawRectangle();
		smf.drawSquare();

	}

}

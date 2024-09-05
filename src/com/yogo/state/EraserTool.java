package state;

public class EraserTool extends Tool {

	@Override
	public void mouseDown() {
		System.out.println("Eraser Icon");
	}

	@Override
	public void mouseUp() {
		System.out.println("Erase something");
	}
	
}

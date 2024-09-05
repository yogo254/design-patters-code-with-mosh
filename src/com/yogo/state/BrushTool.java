package state;

public class BrushTool extends Tool {

	@Override
	public void mouseDown() {
		System.out.println("Brush Icon");
	}

	@Override
	public void mouseUp() {
		System.out.println("Draw a line");
	}
	
}

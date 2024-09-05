package state;

public class SelectionTool extends Tool {

	@Override
	public void mouseDown() {
		System.out.println("Selection Icon");
	}

	@Override
	public void mouseUp() {
		System.out.println("Draw dashed rectangle");
	}
	
}

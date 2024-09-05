import state.BrushTool;
import state.Canvas;
import state.EraserTool;
import state.SelectionTool;

/**
 * Main
 */
public class Main {

	public static void main(String[] args) {
		var canva = new Canvas();

		canva.setCurrentTool(new EraserTool());
		canva.mouseDown();
		canva.mouseUp();
		canva.setCurrentTool(new BrushTool());

		canva.mouseDown();
		canva.mouseUp();

		canva.setCurrentTool(new SelectionTool());

		canva.mouseDown();
		canva.mouseUp();

	}

}
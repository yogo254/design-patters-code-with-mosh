package momento;

import java.util.ArrayDeque;
import java.util.Deque;

public  class EditorHistory implements StateHistory {

	private Deque<EditorState> history = new ArrayDeque<>();

	@Override
	public void push(EditorState state) {
		history.push(state);
	}

	@Override
	public EditorState pop() {
		return history.pop();
		
	}

	
		
}

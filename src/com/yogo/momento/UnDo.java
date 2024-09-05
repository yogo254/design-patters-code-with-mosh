package momento;

import java.util.ArrayDeque;
import java.util.Deque;

public abstract class UnDo {

	private Deque<String> history = new ArrayDeque<>();

	public abstract void undo();

	public Deque<String> getHistory() {
		return history;
	}

	public void setHistory(Deque<String> history) {
		this.history = history;
	}
		
}

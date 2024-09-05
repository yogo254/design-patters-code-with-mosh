package momento;

public interface StateHistory {
	void push(EditorState state);
	EditorState pop();

}

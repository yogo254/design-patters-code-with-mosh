package momento;

public class Editor  {
	private String content;
	private StateHistory history = new EditorHistory();

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		history.push(new EditorState(content));
	}

	public void undo() {
		history.pop();
		content = history.pop().getContent();
	}

}

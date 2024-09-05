package momento;

public class Editor extends UnDo {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		getHistory().push(content);
	}

	@Override
	public void undo() {

		if (getHistory().isEmpty()) {
			return;
		}
		getHistory().pop();
		String lastState = getHistory().pop();
		System.out.println("Undoing to " + lastState);
		content = lastState;

	}

}

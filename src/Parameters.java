
public enum Parameters {
	
	KILL(0),ADD(2);
	
	int value;

	private Parameters(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	
}

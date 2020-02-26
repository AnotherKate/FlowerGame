
public enum Parametry {
	
	KILL(0),ADD(2);
	
	int value;

	private Parametry(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	
}

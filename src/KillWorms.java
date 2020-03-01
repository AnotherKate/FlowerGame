
public interface KillWorms{
	
	default int killWorms(int worms) {
		worms =worms* Parameters.KILL.getValue();
		return worms;
	}
	

}

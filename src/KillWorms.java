
public interface KillWorms{
	
	default int killWorms(int worms) {
		worms =worms* Parametry.KILL.getValue();
		return worms;
	}
	

}

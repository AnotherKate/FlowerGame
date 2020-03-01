
public interface AddFertilizer {
	
	
	default int addFertilizer(int fertilizer) {
		fertilizer = fertilizer+Parameters.ADD.getValue();
		
		return fertilizer;
	}

}

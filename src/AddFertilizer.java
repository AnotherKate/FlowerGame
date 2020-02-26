
public interface AddFertilizer {
	
	
	default int addFertilizer(int fertilizer) {
		fertilizer = fertilizer+Parametry.ADD.getValue();
		
		return fertilizer;
	}

}

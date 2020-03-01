
public interface AddWater {
	
	default int addWater(int water) {
		water = water+Parameters.ADD.getValue();
		
		return water;
	}

}

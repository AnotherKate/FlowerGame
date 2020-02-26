
public interface AddWater {
	
	default int addWater(int water) {
		water = water+Parametry.ADD.getValue();
		
		return water;
	}

}


public class Flower implements KillWorms, AddWater, AddFertilizer{
	
	private boolean ifAlive; 
	private int water;
	private int sun;
	private int worms;
	private int fertilizer;
	
	
	
	public Flower() {
		this.ifAlive = true;
		this.water = (int)(Math.random()*4)+1;
		this.sun = (int)(Math.random()*5)+0;
		this.worms = (int)(Math.random()*1)+0;
		this.fertilizer = (int)(Math.random()*4)+1;
	}

	public boolean isIfAlive() {
		if (water<1||water>4||worms>2||fertilizer<1||fertilizer>4)
			return false;
		return ifAlive;
	}

	public void getWater() {
		water = addWater(water);
	}

	public void getSun() {
		sun = (int)(Math.random()*5)+0;
	}

	public void getWorms(){
		worms = killWorms(worms);
	}


	public void getFertilizer() {
		fertilizer = addFertilizer(fertilizer);
	}
	
	public void getdayCykle() {
		 if (sun<3)
			 water=water-1;
		 else
			 water=water-2;
		 if (worms == 0)
			 worms=(int)(Math.random()*1)+0;
		 else
			 worms=worms+1;
		fertilizer=fertilizer-1;
	}


	@Override
	public String toString() {
		return "Flower: water=" + water + ", sun=" + sun + ", worms=" + worms + ", fertilizer="
				+ fertilizer;
	}



	
	

}

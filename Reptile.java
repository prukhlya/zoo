package zooAssignment;

public class Reptile extends Animal {

	private boolean scales = false;
	private boolean poisonous = false;
	private boolean blendsIn = false;
	private boolean claws = false;

	public Reptile(String name, String environment, String commonColor, boolean coldBlooded, boolean canFly,
			int numberOfLegs, boolean livesInWater, String methodOfTravel, String gender, float averageWeight,
			boolean laysEggs, boolean scales, boolean poisonous, boolean blendsIn, boolean claws) {
		super(name, environment, commonColor, coldBlooded, canFly, numberOfLegs, livesInWater, methodOfTravel, gender,
				averageWeight, laysEggs);
		this.scales = scales;
		this.poisonous = poisonous;
		this.blendsIn = blendsIn;
		this.claws = claws;
	}

	public boolean isScales() {
		return scales;
	}

	public void setScales(boolean scales) {
		this.scales = scales;
	}

	public boolean isPoisonous() {
		return poisonous;
	}

	public void setPoisonous(boolean poisonous) {
		this.poisonous = poisonous;
	}

	public boolean isBlendsIn() {
		return blendsIn;
	}

	public void setBlendsIn(boolean blendsIn) {
		this.blendsIn = blendsIn;
	}

	public boolean isClaws() {
		return claws;
	}

	public void setClaws(boolean claws) {
		this.claws = claws;
	}

	@Override
	public String toString() {
		return "Reptile [scales=" + scales + ", poisonous=" + poisonous + ", blendsIn=" + blendsIn + ", claws=" + claws
				+ ", name=" + name + ", environment=" + environment + ", commonColor=" + commonColor + ", coldBlooded="
				+ coldBlooded + ", canFly=" + canFly + ", numberOfLegs=" + numberOfLegs + ", livesInWater="
				+ livesInWater + ", methodOfTravel=" + methodOfTravel + ", gender=" + gender + ", averageWeight="
				+ averageWeight + ", laysEggs=" + laysEggs + "]";

	}
}
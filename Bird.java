package zooAssignment;

public class Bird extends Animal {

	private boolean talons = false;
	private boolean beak = true;
	private boolean feathers = true;

	public Bird(String name, String environment, String commonColor, boolean coldBlooded, boolean canFly,
			int numberOfLegs, boolean livesInWater, String methodOfTravel, String gender, float averageWeight,
			boolean laysEggs, boolean talons, boolean beak, boolean feathers) {
		super(name, environment, commonColor, coldBlooded, canFly, numberOfLegs, livesInWater, methodOfTravel, gender,
				averageWeight, laysEggs);
		this.talons = talons;
		this.beak = beak;
		this.feathers = feathers;
	}

	public boolean isTalons() {
		return talons;
	}

	public void setTalons(boolean talons) {
		this.talons = talons;
	}

	public boolean isBeak() {
		return beak;
	}

	public void setBeak(boolean beak) {
		this.beak = beak;
	}

	public boolean isFeathers() {
		return feathers;
	}

	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}

	@Override
	public String toString() {
		return "The Zoo has a bird.  It is " + talons + " that it has  talons. " + "It is also " + beak + " that it has a beak. " + "And it is " + feathers + " that it has feathers. " + "It is a " + name
				+ ", lives in " + environment + ", and is commonly " + commonColor + ". If you thought it was cold blooded, that is " + coldBlooded
				+ ". You thought it could fly, that is " + canFly + ". It has " + numberOfLegs + " legs. " + " I was told it lives in water, that is " + livesInWater
				+ ". It gets around by " + methodOfTravel + ", and it is a " + gender + ", with an average weight of " + averageWeight + " pounds"
				+ ". If you thought this bird layed eggs, that is " + laysEggs + ".";
	}
	
}

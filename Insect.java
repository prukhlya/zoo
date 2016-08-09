package zooAssignment;

public class Insect extends Animal {
    
    private boolean vertebrae = false;
    private boolean spinsWeb = false;
    private boolean pollinatesPlants = false;
    
    public Insect(String name, String environment, String commonColor, boolean coldBlooded, boolean canFly,
            int numberOfLegs, boolean livesInWater, String methodOfTravel, String gender, float averageWeight,
            boolean laysEggs, boolean vertebrae, boolean spinsWeb, boolean pollinatesPlants) {
        super(name, environment, commonColor, coldBlooded, canFly, numberOfLegs, livesInWater, methodOfTravel, gender,
                averageWeight, laysEggs);
        this.vertebrae = vertebrae;
        this.spinsWeb = spinsWeb;
        this.pollinatesPlants = pollinatesPlants;
    }

    public boolean isVertebrae() {
        return vertebrae;
    }

    public void setVertebrae(boolean vertebrae) {
        this.vertebrae = vertebrae;
    }

    public boolean isSpinsWeb() {
        return spinsWeb;
    }

    public void setSpinsWeb(boolean spinsWeb) {
        this.spinsWeb = spinsWeb;
    }

    public boolean isPollinatesPlants() {
        return pollinatesPlants;
    }

    public void setPollinatesPlants(boolean pollinatesPlants) {
        this.pollinatesPlants = pollinatesPlants;
    }

    @Override
    public String toString() {
        return "Insect [vertebrae=" + vertebrae + ", spinsWeb=" + spinsWeb + ", pollinatesPlants=" + pollinatesPlants
                + ", name=" + name + ", environment=" + environment + ", commonColor=" + commonColor + ", coldBlooded="
                + coldBlooded + ", canFly=" + canFly + ", numberOfLegs=" + numberOfLegs + ", livesInWater="
                + livesInWater + ", methodOfTravel=" + methodOfTravel + ", gender=" + gender + ", averageWeight="
                + averageWeight + ", laysEggs=" + laysEggs + "]";
    } 
    
    

}

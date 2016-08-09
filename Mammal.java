package zooAssignment;

public class Mammal extends Animal{

    private String skin = null;
    private String eatsWhat = null;
    
    public Mammal(String name, String environment, String commonColor, boolean coldBlooded, boolean canFly,
            int numberOfLegs, boolean livesInWater, String methodOfTravel, String gender, float averageWeight,
            boolean laysEggs, String skin, String eatsWhat) {
        
        super(name, environment, commonColor, coldBlooded, canFly, numberOfLegs, livesInWater, methodOfTravel, gender,
                averageWeight, laysEggs);
        
        this.skin = skin;
        this.eatsWhat = eatsWhat;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getEatsWhat() {
        return eatsWhat;
    }

    public void setEatsWhat(String eatsWhat) {
        this.eatsWhat = eatsWhat;
    }

    @Override
    public String toString() {
        return "The Zoo has a mammal that has " + skin + " and eats " + eatsWhat + ". It is a " + name + ". It lives at " + environment + ".\n"
                + " and generally looks " + commonColor + ". I thought that it was cold blooded, but I learned that is " + coldBlooded + ". I thought it common knowledge that this mammal could fly, that is " + canFly
                + ". It has " + numberOfLegs + " legs. "+ "I have been told that it lives in water, but at the Zoo, they told me that is " + livesInWater + ". It's method of travel is "
                + methodOfTravel + ", and it is " + gender + ", and has an average weight of " + averageWeight + " pounds" + ". I thought that these mammals lay the best eggs, and learned that is " + laysEggs
                + ".";
    } 
    
}
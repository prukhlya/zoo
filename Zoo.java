package zooAssignment;

import java.util.ArrayList;

import notesPt2.Person;

public class Zoo {

	public static void main(String[] args) {
	
		ArrayList<Animal> ourZoo = new ArrayList <>(10);
		
		Mammal Kangaroo = new Mammal("kangaroo", "Outback Steakhouse", "tan", false, false, 2, false, "hopping", "male", 150f, false, "fur", "plants");
        Mammal Dog = new Mammal("dog", "home", "brown, black or white", false, false, 4, false, "walking/running", "female", 30f, false, "fur", "dog food");
        Fish Catfish = new Fish("Catfish", "Lakes", "Black", true, false, 0, true, "Swim", "Male", 50f, true, true, false, "Louisiana", 5);
        Fish GreatWhiteShark = new Fish("Great White Shark", "Ocean", "White", true, false, 0, true, "Swim", "Male", 1300f, false, false, true, "Somewhere Else", 14);
        Reptile RattleSnake = new Reptile("Rattle Snake", "Desert", "Grey", true, false, 0, false, "Slither", "Female", 7f, false, true, true, true, false);
        Reptile Alligator = new Reptile("Alligator", "Swamp", "Brown", true, false, 4, true, "Walk/Run/Swim", "Male", 700f, false, true, false, true, true);
        Bird Penguin = new Bird("Penguin", "the artic", "black and white", false, false, 2, true, "walking/swimming", "female", 50f, true, false, true, true);
        Bird Oriole = new Bird("Oriole", "Baltimore", "orange", false, true, 2, false, "flying", "female", 4f, true, true, true, true);
        Insect Spider = new Insect("Spider", "Your House", "black", true, false, 8, false, "Crawl", "Female", 1f, true, false, true, false);
        Insect Bee = new Insect("Bee", "Flower Beds", "Yellow/Black", true, true, 6, false, "Fly", "Male", 4f, false, false, false, true);
		
        ourZoo.add(Kangaroo);
        ourZoo.add(Dog);
        ourZoo.add(Catfish);
        ourZoo.add(GreatWhiteShark);
        ourZoo.add(RattleSnake);
        ourZoo.add(Alligator);
        ourZoo.add(Penguin);
        ourZoo.add(Oriole);
        ourZoo.add(Spider);
        ourZoo.add(Bee);
        
        for(int i = 0; i < ourZoo.size(); i++){  //currently only the mammals and birds are formatted into actual sentences
        	System.out.println(ourZoo.get(i));
        	System.out.println(" ");
        }
        
       /* System.out.println(Kangaroo.toString()); 
        System.out.println(" ");
        System.out.println(Dog.toString());
        System.out.println(" ");
        System.out.println(Penguin.toString());
        System.out.println(" ");
        System.out.println(Oriole.toString());
        */
	}
}

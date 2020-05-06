/*
 * All Cats are Animals but all Animals are not Cats
 * Name:
 * Taoheed King
 */
public class Mouse extends Animal {
    public Mouse(){
        System.out.println("This is a mouse that...");
    }

    public String sleep(){
        return "A mouse never sleeps";
    }

    public String eat(){
        return "A mouse eats anything...";
    }

    public String move(){
        return "A mouse runs fast...";
    }
}

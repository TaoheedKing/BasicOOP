/*
 * All Cats are Animals but all Animals are not Cats
 * Name:
 * Taoheed King
 */public class Dog extends Animal{
    public Dog(){
        super();
        System.out.println("Now a dog has appeared!");
    }

    public String sleep(){
        return "A dog sleeps...";
    }

    public String eat(){
        return "A dog eats...";
    }

    public String run(){
        return "A dog runs..";
    }
}

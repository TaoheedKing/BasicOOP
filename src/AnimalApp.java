public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        System.out.println();

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());

        System.out.println();

        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        Mouse m = new Mouse();
        print(m.eat());
        print(m.sleep());
        print(m.move());

        System.out.println();

        Dog d = new Dog();
        print(d.eat());
        print(d.sleep());
        print(d.run());

    }

    private static void print(String s) {
        System.out.println(s);
    }
}
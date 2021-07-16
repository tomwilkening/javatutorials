package Zoo;

public class ZooMain {

    // We are going to want to setup our zoo to only allow the same animal in the cage.
    // This is going to be a generic...

    public static void main(String[] args) {

        Cage<Monkey> monkeyCage = new Cage<Monkey>();
        monkeyCage.setAnimal1(new Monkey("Small"));
        monkeyCage.setAnimal2(new Monkey("Small"));
        System.out.println(monkeyCage.isCompatible());

        Cage<Lion> lionCage = new Cage<Lion>();
        lionCage.setAnimal1(new Lion());
        lionCage.setAnimal1(new Lion());

        // Note: when declaring things, it checks the right then the left.
        //     Thus, the code         Cage<Monkey> cage = new Cage(new Monkey(), new Lion()); would run
        //     You need to make sure the constructor parameter exists on both sides.
        Cage<Monkey> cage = new Cage<Monkey>(new Monkey(), new Monkey());

        Monkey myMonkey1 = new Monkey("Medium");
        Monkey myMonkey2 = new Monkey("Small");
        System.out.println(Cage.isStaticCompatible(myMonkey1,myMonkey2));


    }
}

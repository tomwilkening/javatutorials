package Zoo;

// In this zoo, we aren't extending animal, but are going to use generics to be flexible about the type of animal
// Note:  We want to make sure that each cage only allows a single type of monkey!

// Note that the order for extends is [class],[interface],...,[interface].  Order matters.
public class Cage<E extends Animal & Eats & Runs> {

    private E animal1;
    private E animal2;

    public Cage(E animal1, E animal2){
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public Cage(){}

    public E getAnimal1() {
        return animal1;
    }

    public void setAnimal1(E animal1) {
        this.animal1 = animal1;
    }

    public E getAnimal2() {
        return animal2;
    }

    public void setAnimal2(E animal2) {
        this.animal2 = animal2;
    }

    public boolean isCompatible(){
        return animal1.getType().equals(animal2.getType());
    }

    // In Static Calls, you need to add generics before the return type.
    // Note that you cannot use the generic of the class for the static call.
    static public <E extends Animal> boolean isStaticCompatible(E animal1, E animal2){
        return animal1.getType().equals(animal2.getType());
    }

    public void feedAnimal() {
        animal1.eat();
        animal1.eat();
    }
}

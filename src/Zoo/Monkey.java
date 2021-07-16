package Zoo;

public class Monkey extends Animal implements Eats, Runs{

    public Monkey(String type){
        this.setType(type);
    }

    public Monkey(){};

    public void eat(){}
    public void run(){}
}

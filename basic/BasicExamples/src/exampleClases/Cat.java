package exampleClases;

public class Cat extends Pet {
    private int lifes;
    private String catKind;

    public Cat(String name, String ownerName, int age, int lifes, String catKind) {
        super(name, ownerName, age);
        this.catKind = catKind;
        this.lifes = lifes;
    }

    public void meow() {
        System.out.println("i am a cat Meow!!!");
    }

    public int getLifes() {
        return lifes;
    }

    public void setLifes(int lifes)
    {
        this.lifes = lifes;
    }

    public void kill()
    {
        if(lifes>0)
            lifes--;
        else
            System.out.println("You cant kill a dead cat");
    }
}
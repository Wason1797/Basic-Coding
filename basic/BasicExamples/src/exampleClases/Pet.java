package exampleClases;

public class Pet {

    private String name;
    private String ownerName;
    private int age;

    public Pet(String name, String ownerName, int age) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
    }

    public void givePetInformation() {
        System.out.println("Pet name: "+name+" , pet owner:"+ownerName+", pet age: "+age);
    }

}
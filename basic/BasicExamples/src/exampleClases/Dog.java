package exampleClases;

public class Dog extends Pet {

    private String dogKind;
    private String dogVaccines;

    public Dog(String name, String ownerName, int age, String dogKind, String dogVaccines) {
        super(name, ownerName, age);
        this.dogKind = dogKind;
        this.dogVaccines = dogVaccines;
    }

    public void bark() {
        System.out.println("I am a dog, Guau Gua !!");
    }

    public void printVaccines() {
        String []vaccineArr = this.dogVaccines.split("@");
        for (int i=0;i<vaccineArr.length;i++) {
            System.out.println("la vacuna "+vaccineArr[i]+" ha sido aplicada");
        }
    }

    public void printDogKind() {
        System.out.println(dogKind);
    }

    public String getDogVaccines() {
        return this.dogVaccines;
    }

    public void setDogVaccines(String vaccines)
    {
        this.dogVaccines = vaccines;
    }

}
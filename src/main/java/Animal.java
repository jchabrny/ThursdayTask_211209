public class Animal {
    private String animal;

    public Animal(String animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Animal=" + animal;
    }
}

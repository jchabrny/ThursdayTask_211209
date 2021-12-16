public class Main {
    public static void main(String[] args) {

        UniversalLinkedList<Plant> plantList = new UniversalLinkedList();
        UniversalLinkedList<Animal> animalList = new UniversalLinkedList();


        plantList.add(new Plant("Blume"));

        System.out.println(animalList);

        plantList.add(new Plant("Baum"));

        System.out.println(animalList);

        animalList.add(new Animal("Katze"));

        System.out.println(animalList);

        animalList.remove(new Animal("Katze"));
        System.out.println(animalList);


        System.out.println(plantList);
        System.out.println(animalList);
    }
}

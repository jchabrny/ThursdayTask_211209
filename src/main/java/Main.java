public class Main {
    public static void main(String[] args) {

        Animal camel1 = new Animal("camel1");
        Animal camel2 = new Animal("camel2");

        AnimalListItem container1 = new AnimalListItem(camel1);
        AnimalListItem container2 = new AnimalListItem(camel2);
        AnimalList list = new AnimalList(container1);

        list.next(container2);
        list.next(container2);
        list.next(container2);
        System.out.println(list);
    }
}

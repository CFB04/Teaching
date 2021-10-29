package tutorial;

public class ObjectPractice {

    public static void main(String[] args) {
        Dog dog = new Dog("Dog", 12, true);

        System.out.println(dog.getName());
        dog.setName("Rover");
        System.out.println(dog.getName());
    }
}

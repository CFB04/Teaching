package tutorial;

public class Dog extends Pet{
    private boolean dewormed;
    private static int numberOfDogs = 0;

    public Dog(String name, int age, boolean dewormed)
    {
        super(name, age);
        this.dewormed = dewormed;

        numberOfDogs++;
    }

    @Override
    public void walk()
    {
        System.out.println("Walk Bark Walk");
    }

    @Override
    public void sleep()
    {
        if(age > 10) {
            System.out.println("snore");
        } else
        {
          System.out.println("sleep");
        }
    }

    public boolean isDewormed() {
        return dewormed;
    }

    public void setDewormed(boolean dewormed) {
        this.dewormed = dewormed;
    }

    public static int getNumberOfDogs() {
        return numberOfDogs;
    }
}

package dogs;

public class TestDog {

    public static void main(String[] args) {
        // create two dogs
        Dog d1 = new Dog(); // using no-args constructor
        Dog d2 = new Dog("Bob"); // using an overloaded constructor

        // try to set d1's name to an invalid name.
        d1.setName("Amos");

        // use the getter to access d1's name property value
        System.out.printf("The name of d1 is %s\n", d1.getName());

        // call each dog's bark method
        d1.bark();
        d2.bark();

        // print out each dog as if it were a string
        System.out.printf("dog1: %s\n", d1);
        System.out.printf("dog2: %s\n", d2);

        // access the static numDogs property through its getter
        System.out.printf("There are %d dogs in the universe.\n", Dog.getNumDogs());

        // use the custom .equals method to dtermine whether two dogs have all the same values.
        if (d1 == d2)  {
            System.out.println("d1 and d2 are the same dog!");
        }
        else if (d1.equals(d2))  {
            System.out.println("d1 and d2 have all the same properties!");
        }
        else {
            System.out.println("d1 and d2 are completely different dogs!");
        }
    }

    
}

// comment
/* comment */
import java.util.*;

public class Animal {

    public static final double FAVNUMBER = 1.6565;

    private String name;
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueId;
    private char favoriteChar;
    private double speed;
    private float height;

    protected static int numberOfAnimals = 0;

    static Scanner userInput = new Scanner(System.in);

    public Animal() {
        numberOfAnimals++;

        int sumOfNumbers = 5+1;
        System.out.println("5+1 = " + sumOfNumbers);
    }
}

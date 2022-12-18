import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i<20; i++){
            System.out.println("Random number is: " + random.nextInt(10));
        }
        random.nextInt(10);
    }
}
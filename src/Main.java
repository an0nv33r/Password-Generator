import java.util.Scanner;

public class Main {
    public  static  final Scanner veer = new Scanner(System.in);

    public static void main(String[] args) {
        Generator generator = new Generator(veer);
        generator.mainLoop();
        veer.close();
    }
}

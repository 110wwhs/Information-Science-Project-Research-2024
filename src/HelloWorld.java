import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.next();
            System.out.println("Hello " + name + "!");
        }
    }
}

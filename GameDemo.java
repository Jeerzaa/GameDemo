import java.util.Scanner;

public class GaneDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter character type (warrior, mage, archer): ");
        String type = scanner.nextLine();

        try {
            character character = Characterfactory.createCharacter(type);
            character.attack();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

}

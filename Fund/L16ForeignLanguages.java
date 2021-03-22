import java.util.Scanner;

public class L16ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfCountry = scanner.nextLine();

        switch (nameOfCountry) {
            case "USA":
            case "England":
                System.out.println("English");
                break;
            case "Spain":
            case "Mexico":
            case "Argenitina":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}


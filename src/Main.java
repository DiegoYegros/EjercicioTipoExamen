import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File menuFile = new File(Globals.MENUS);
        try {
            Scanner scanner = new Scanner(menuFile);
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                List<String> menusList = Arrays.asList(data.split(",[ ] *"));
                System.out.print(menusList.get(0));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
    public static List<String> readFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String data = scanner.nextLine();
            List<String> menusList = Arrays.asList(data.split(",[ ] *"));
            return menusList;
        }
        scanner.close();
        return null;
    }
}
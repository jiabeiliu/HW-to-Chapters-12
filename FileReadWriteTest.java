import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteTest {

    public static void main(String[] args) {
        String filePath = "my_test_file.txt";

        // Step 1 & 2: Read from file and print
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            System.out.println("Read from file: " + line);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Step 3: Accept input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phrase: ");
        String inputLine = scanner.nextLine();

        // Step 4: Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(inputLine);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Step 5 is manual: Open file "my_test_file.txt" with Notepad
    }
}

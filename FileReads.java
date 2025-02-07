import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// edited by Michael Nguyen
public class FileReads {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("./wordpopbyLine.txt"));

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(line);

            String country = "";
            double value = 0;

            // Extract country name (which may have multiple words)
            while (lineScanner.hasNext() && !lineScanner.hasNextInt()) {
                if (!country.isEmpty()) {
                    country += " ";
                }
                country += lineScanner.next();
            }

            // Extract population value
            if (lineScanner.hasNextInt()) {
                value = lineScanner.nextInt();
            }

            // Print extracted information
            System.out.printf("The country is %s (Population: %.0f)\n", country, value);

            // Close the line scanner
            lineScanner.close();
        }

        // Close the file scanner
        fileScanner.close();
    }
}
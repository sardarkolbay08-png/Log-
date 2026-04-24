import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogAnalyzer {

    public static void main(String[] args) {

        String fileName = "log.txt";

        int errorCount = 0;
        int infoCount = 0;
        int warningCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {

                if (line.contains("ERROR")) {
                    errorCount++;
                }

                if (line.contains("INFO")) {
                    infoCount++;
                }

                if (line.contains("WARNING")) {
                    warningCount++;
                }
            }

            System.out.println("===== Лог анализ нәтижесі =====");
            System.out.println("ERROR саны: " + errorCount);
            System.out.println("INFO саны: " + infoCount);
            System.out.println("WARNING саны: " + warningCount);

        } catch (IOException e) {
            System.out.println("Файлды оқу кезінде қате шықты!");
            e.printStackTrace();
        }
    }
}

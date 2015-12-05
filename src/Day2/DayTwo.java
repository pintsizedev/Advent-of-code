package Day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by pintsizedev
 */
public class DayTwo {

    public static void main(String[] args) {

        GetTotalPaperNeeded getTotalPaperNeeded = new GetTotalPaperNeeded(
                new GetSmallestSide(),
                new WorkOutTotalArea()
        );

        int totalPaperNeeded = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(new File(System.getProperty("user.dir") + "/inputs/dayTwo.txt")))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] sizes = line.split("x");
                totalPaperNeeded += getTotalPaperNeeded.getTotal(Integer.parseInt(sizes[0]), Integer.parseInt(sizes[1]), Integer.parseInt(sizes[2]));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.out.println("Total needed to be ordered: " + totalPaperNeeded);
    }

}

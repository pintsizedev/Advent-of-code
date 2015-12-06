package AdventOfCode.Day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by pintsizedev
 */
public class DayTwo {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(new File(System.getProperty("user.dir") + "/inputs/dayTwo.txt")))) {

            // Get Total area of wrapping paper to be ordered
            SolvePartOne solvePartOne = new SolvePartOne(br);
            solvePartOne.solve();

            // Get total ribbon to be ordered
            SolvePartTwo solvePartTwo = new SolvePartTwo(br);
            solvePartTwo.solve();

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}

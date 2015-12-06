package AdventOfCode.Day2;


import AdventOfCode.Solver;

import java.io.BufferedReader;

/**
 * Created by pintsizedev
 */
public class SolvePartOne implements Solver {

    private BufferedReader reader;

    private AdventOfCode.Day2.UseCase.GetTotalPaperNeeded getTotalPaperNeeded;

    public SolvePartOne(BufferedReader reader) {
        this.reader = reader;
        this.getTotalPaperNeeded = new GetTotalPaperNeeded(
                new GetSmallestSide(),
                new WorkOutTotalArea()
        );
    }


    @Override
    public void solve() {
        String line;
        int totalPaperNeeded = 0;
        try {
            while ((line = reader.readLine()) != null) {
                String[] sizes = line.split("x");
                totalPaperNeeded += getTotalPaperNeeded.getTotal(Integer.parseInt(sizes[0]), Integer.parseInt(sizes[1]), Integer.parseInt(sizes[2]));
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}

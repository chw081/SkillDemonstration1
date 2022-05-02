import java.util.ArrayList;

public class skillDemon {
    private ArrayList<Integer> testScores;

    public skillDemon() {
        testScores = new ArrayList<Integer>();
    }

    public void add(int score) {
        testScores.add(score);
    }

    public double averageScore() {
        int sum = 0;
        for (int i = 0; i < testScores.size(); i++) {
            sum += testScores.get(i);
        }
        return (double)sum / testScores.size();
    }
}
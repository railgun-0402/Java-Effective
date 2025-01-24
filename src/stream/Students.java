package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students {
    private String name;
    private int score;

    public Students(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + ":" + score;
    }

    public void lambda() {
        List<Students> studentsList = new ArrayList<>();
        studentsList.add(new Students("Murata", 100));
        studentsList.add(new Students("Okada", 70));
        studentsList.add(new Students("Tanimoto", 80));

        System.out.println(studentsList);

        Collections.sort(studentsList, (student1, student2) -> Integer.compare(student1.getScore(), student2.getScore()));

        System.out.println(studentsList);
    }
}

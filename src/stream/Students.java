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

        studentsList.stream()
                        .filter(student -> student.getScore() > 70)
                                .forEach(student -> System.out.println(student.getScore()));

    }

    public void sort() {
        List<Students> studentsList = new ArrayList<>();
        studentsList.add(new Students("Murata", 100));
        studentsList.add(new Students("Okada", 70));
        studentsList.add(new Students("Tanimoto", 80));

        studentsList.stream()
                .sorted((student1, student2) -> student2.getScore() - student1.getScore())
                .forEach(student -> System.out.println(student.getName() + " " + student.getScore()));
    }
}

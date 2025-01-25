package stream;

import java.util.*;
import java.util.stream.Collectors;

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

    public void builder() {
        List<String> list = Arrays.asList("Murata", "Okada", "Tanimoto");

        List<String> newList = list.stream()
                .filter(p -> p.length() > 5)
                .map(p -> "[" + p + "]")
                .toList();

        newList.forEach(System.out::println);
    }

    public void listChange() {
        List<String> list = new ArrayList<>();
        list.add("Murata");
        list.add("Okada");
        list.add("Tanimoto");

        // 5文字以下は消える
        list.removeIf(student -> student.length() <= 5);
        // 要素を大文字に
        list.replaceAll(String::toUpperCase);

        list.forEach(System.out::println);
    }

    public void compute() {
        List<String> list = new ArrayList<>();
        list.add("Murata");
        list.add("Okada");
        list.add("Tanimoto");
        list.add("sato");

        Map<Integer, List<String>> map = new HashMap<>();
        list.forEach(name -> {
            Integer nameLen = name.length();
            // keyに値がある時のみ処理
            List<String> valueList = map.computeIfAbsent(nameLen, k -> new ArrayList<>());

            valueList.add(name);
        });
        System.out.println(map);
    }
}

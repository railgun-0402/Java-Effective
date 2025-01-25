import stream.Students;

public class Main {
    public static void main(String[] args) {

        Students students = new Students("Tomo", 55);
        students.lambda();
        students.sort();
        students.builder();
        students.listChange();
        students.compute();
    }
}
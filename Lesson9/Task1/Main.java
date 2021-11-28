package Lesson9.Task1;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            new Thread(new MyThread(i), String.valueOf(i)).start();
        }
    }
}

package Lesson9.Task2;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        for (int i = 1; i < 4; i++) {
            new MyThread(sb).start();
        }
    }
}

package Lesson6.Task2;

public class main {
        public static void main(String[] args) {

            MyArrayList<String> list = new MyArrayList<>();
            
            list.add("3");
            list.add("4");
            list.add("6");
            list.add("3");
            list.add("1");
            list.add("4");
            list.add("8");
            list.add("20");
            list.print();
            list.remove(1);
            list.print();
            list.remove("4");
            list.print();
            System.out.println(list.get(3)); 
            list.clear();
            list.add("1","3","dsa","da");
            list.print();
    }
}
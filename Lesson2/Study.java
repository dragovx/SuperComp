package Lesson2;

public class Study {
    public static void main(String[] msi) {
        Student student = new Student("Sergey", "Shishkin", "bap1801", 4.5);
        Aspirant aspirant = new Aspirant("Nikita", "Belov", "isua", 4, "drone");
        Student un = new Aspirant("Andrey", "Eliseev", "bap1801", 5, "aboutSpace");
        Student[] students = { student, aspirant, un };

        for (Student s : students)
            System.out.println(s.getScholarship());
    }

    public static class Student {
        String firstName, lastName, group;
        double averageMark;
    
        public Student(String firstName, String lastName, String group, double averageMark) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.group = group;
            this.averageMark = averageMark;
        }
    
        int getScholarship() {
            return averageMark == 5 ? 100 : 80;
        }
    }

    public static class Aspirant extends Student {
        String scientificWork;
    
        public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
            super(firstName, lastName, group, averageMark);
            this.scientificWork = scientificWork;
        }
    
        @Override
        public int getScholarship() {
            return averageMark == 5 ? 200 : 180;
        }
    }
}

package OgrenciNotSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Berke", "Mth", "555");
        Teacher t2 = new Teacher("Ayşe", "Phy", "123");
        Teacher t3 = new Teacher("Mert", "Eng", "444");

        Course math = new Course("Math", "101", "Mth");
        Course physics = new Course("Physics", "102", "Phy");
        Course english = new Course("English", "101", "Eng");

        math.addTeacher(t1);
        System.out.println("----------------------------------");
        physics.addTeacher(t2);
        System.out.println("----------------------------------");
        english.addTeacher(t3);
        

        Student s1 = new Student("Ali", "111", "3", math, physics, english);

        s1.addBulkExamNote(100, 80, 60);
        System.out.println("----------------------------------");
        s1.addBulkVerbalNote(60, 70, 80);
        System.out.println("----------------------------------");
        s1.isPass();
        System.out.println("----------------------------------");

    }
}

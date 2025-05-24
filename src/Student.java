public class Student extends Person {
    String school;

    public Student(String name, int age, String school) {
        super(name, age); // Эцэг class-ийн constructor-г дуудаж байна
        this. school = school;

    }

    public void study() {
        System.out.println(name + "is studying at " + school);
    }
}

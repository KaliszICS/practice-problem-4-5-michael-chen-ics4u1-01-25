public class Student {
    /**
     * Class to define a student
     * @author Michael Chen
     * @version 1.0.0
     */
    private String name;
    private int age;
    private String studentNumber;

    /**
     * Constructor for a student
     * @param name Name of the student
     * @param age Age of the student
     * @param studentNumber Student number of the student
     */
    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    /**
     * Gets the name of the student
     * @return name of the student
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the age of the student
     * @return age of the student
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Gets the student number of a student
     * @return student number of a student
     */
    public String getStudentNumber() {
        return this.studentNumber;
    }

    /**
     * Overrides the toString method, returning name, age, and student number in "name, age - student number" format
     * @return the student as a string
     */
    @Override
    public String toString() {
        return this.name + ", " + this.age + " - " + this.studentNumber;
    }

    /**
     * Overrides the equals method, evaluating if the instance variables of the Student is the same
     * @return true if instance variables are the same, false if Object is not of type Student or instance variables are not equal
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }
        Student student = (Student) obj;
        return student.getStudentNumber().equals(this.studentNumber);
    }
}

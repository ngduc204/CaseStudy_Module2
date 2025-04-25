package student;

public interface IStudent {
    void addStudent(Student student);

    void updateStudent(int index, String name, int birth, String gender);

    void displayStudents();

    void deleteStudent(String name);

    Student searchStudent(String name);
}

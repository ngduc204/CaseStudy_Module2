import java.util.ArrayList;
import java.util.LinkedList;

class StudentManager {
    private ArrayList<Student> arrayListStudents = new ArrayList<>();
    private LinkedList<Student> linkedListStudents = new LinkedList<>();

    public void addStudent(Student student) {
        arrayListStudents.add(student);
        linkedListStudents.add(student);
     }

    public void updateStudent(int index, String name, int birth, String gender) {
        if (index >= 0 && index < arrayListStudents.size()) {
            Student student = new Student(name, birth, gender);
            arrayListStudents.set(index, student);
            System.out.println("Cập nhật sinh viên thành công");
        } else {
            System.out.println("Không tìm thấy sinh viên với chỉ số: " + index);
        }
    }

    public void displayStudents() {
        System.out.println("--Danh sách sinh viên (ArrayList)--");
        for (Student student : arrayListStudents) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("--Danh sách sinh viên (LinkedList)--");
        for (Student student : linkedListStudents) {
            System.out.println(student);
        }
        System.out.println();
    }

    public void deleteStudent(String name){
        Student student = searchStudent(name);
        if(student != null){
        arrayListStudents.remove(student);
        linkedListStudents.remove(student);
        }
    }

    public Student searchStudent(String name){
        Student student = null;
        boolean found = false;
        for (int i = 0; i < linkedListStudents.size(); i++) {
            if (linkedListStudents.get(i).getName().equals(name)) {
                student = linkedListStudents.get(i);
                found = true;
                break;
            }
        }
        System.out.println(student);
        if (!found) {
            System.out.println("Khong tim thay");
        }
        return student;
    }
}
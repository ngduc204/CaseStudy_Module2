import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        studentManager.addStudent(new Student("Duc", 21, "nam"));
        studentManager.addStudent(new Student("Quan", 27, "nam"));
        studentManager.addStudent(new Student("Nhat", 25, "nam"));
        studentManager.addStudent(new Student("Thanh", 19, "nam"));
        studentManager.addStudent(new Student("Cuong", 20, "nam"));
        studentManager.addStudent(new Student("Dat", 24, "nam"));

        while (true) {
            System.out.println("0. Hiển thị danh sách sinh viên");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Tìm kiếm sinh viên");
            System.out.println("5. Thoát");
            System.out.println("Nhập lựa chọn của bạn (0 - 5)");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0: // Hiển thị danh sách sinh viên
                    studentManager.displayStudents();
                    break;
                case 1: // Thêm sinh viên
                    System.out.println("Nhập tên sinh viên");
                    String name = sc.nextLine();
                    System.out.println("Nhập tuổi sinh viên");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập giới tính sinh viên");
                    String gender = sc.nextLine();
                    Student student = new Student(name, age, gender);
                    studentManager.addStudent(student);
                    break;
                case 2: // Sửa sinh viên
                    System.out.println("Nhập chỉ số sinh viên để sửa:");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập tên mới:");
                    String newName = sc.nextLine();
                    System.out.println("Nhập tuổi mới:");
                    int newAge = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập giới tính mới:");
                    String newGender = sc.nextLine();
                    studentManager.updateStudent(index, newName, newAge, newGender);

                    break;
                case 3: // Xóa sinh viên
                    System.out.println("Nhập tên sinh viên bạn muốn xóa");
                    name = sc.nextLine();
                    studentManager.deleteStudent(name);
                    break;
                case 4: // Tìm kiếm sinh viên
                    System.out.println("Tìm kiếm theo tên sinh viên");
                    name = sc.nextLine();
                    studentManager.searchStudent(name);
                    break;
                case 5: // Thoát
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Số bạn nhập không hợp lệ. Vui lòng nhập lại!!");
            }
        }
    }
}
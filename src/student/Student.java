public class Student {
    private String name;
    private int birth;
    private String gender;

    public Student(String name, int birth, String gender) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "QuanLySinhVien{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                ", gender='" + gender + '\'' +
                '}';
    }
}

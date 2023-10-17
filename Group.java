public class Group {

    private String groupName;
    private final Student[] students;

    public Group() {
        super();
        students = new Student[10];

    }

    public Group(String groupName, Student[] students) {
        super();
        this.groupName = groupName;
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) throws GroupOverflowException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }

        }
        throw new GroupOverflowException("No room for a new student!");
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getLastName().equals(lastName)) {
                    return students[i];
                }
            }

        }

        throw new StudentNotFoundException("Student not found!");
    }

    public boolean removedStudentById(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == id) {
                    students[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "Group" + System.lineSeparator();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                result += students[i] + System.lineSeparator();
            }
        }
        return result;
    }
}

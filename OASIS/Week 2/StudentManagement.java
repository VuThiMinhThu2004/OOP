public class StudentManagement {
    Student[] students = new Student[100];

    /**
     * An especially short bit of Javadoc.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void addStudent(Student newStudent) {
        //TO DO:
        int i = 0;
        while (students[i] != null && i < 100) {
            ++i;
        }
        students[i] = new Student(newStudent);
    }

    /**
     * An especially short bit of Javadoc.
     */
    public String studentsByGroup() {
        //TO DO:
        int i = 0;
        int k = 0;

        String[] check = new String[101];
        while (i < 100 && students[i] != null) {
            int j = 0;
            while (j < i && check[j] != null) {
                if (check[j].equals(students[i].getGroup())) {
                    j = 100;
                } else {
                    j++;
                }
            }            
            if (j != 100 && check[j] == null) {
                check[k] = students[i].getGroup();
                k++;
            }            
            i++;
        }

        i = 0;
        String rs = "";
        while (i < k) {
            rs = rs + check[i] + '\n';
            int j = 0;
            while (students[j] != null) {
                if (check[i].equals(students[j].getGroup())) {
                    rs = rs + students[j].getInfo() + '\n';
                }
                j++;
            }
            i++;
        }
        return rs;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void removeStudent(String id) {
        //TO DO:
        int i = 0;
        while (students[i] != null && !id.equals(students[i].getId())) {
            ++i;
        }
        int j = i;
        if (students[i + 1] != null) {
           while (students[j + 1] != null) {
                assert students[j] != null;
                students[j] = new Student(students[j + 1]);
                ++j;
            }
        }
        students[j] = null;
    }

    public static void main(String[] args) {}
}
 
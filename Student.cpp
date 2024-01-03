#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

class Student {
private:
    int studentId;
    string name;
    int birthYear;
    string gender;
    string studentClass;

public:
    Student(int id, const string &studentName, int year, const string &studentGender, const string &studentClass)
        : studentId(id), name(studentName), birthYear(year), gender(studentGender), studentClass(studentClass) {}

    friend istream& operator >>(istream& input, Student &student) {
        input >> student.studentId >> student.name >> student.birthYear >> student.gender >> student.studentClass;
        return input;
    }

    friend ostream& operator<<(ostream& output, const Student &student) {
        output << student.studentId << " " << student.name << " " << student.birthYear << " " << student.gender << " " << student.studentClass;
        return output;
    }

    int getStudentId() const {
        return studentId;
    }
};

class StudentManager {
private:
    vector<Student> students;

public:
    void addStudent(const Student &student) {
        students.push_back(student);
    }

    void removeStudent(int studentId) {
        students.erase(remove_if(students.begin(), students.end(), [studentId](const Student &student) {
            return student.getStudentId() == studentId;
        }), students.end());
    }

    vector<Student> getlist() {
        return this->students;
    }

    void printStudents() const {
        for (const Student &student : students) {
            cout << student << endl;
        }
    }

    int binarySearch(const vector<int>& arr, int target) {
        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;  // Element found, return its index
            } else if (arr[mid] < target) {
                left = mid + 1;  // Target is in the right half
            } else {
                right = mid - 1;  // Target is in the left half
            }
        }
        return -1;  // Element not found in the array
    }

    Student* findStudentById(int studentId) {
        int left = 0;
        int right = students.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (students[mid].getStudentId() == studentId) {
                return &students[mid];  // Student found
            } else if (students[mid].getStudentId() < studentId) {
                left = mid + 1;  // Target is in the right half
            } else {
                right = mid - 1;  // Target is in the left half
            }
        }
        
        return nullptr;  // Student not found
    }
};

int main() {
    StudentManager manager;

    // Adding students
    manager.addStudent(Student(1, "John", 1995, "Male", "A"));
    manager.addStudent(Student(2, "Jane", 1998, "Female", "B"));
    manager.addStudent(Student(3, "Mike", 1997, "Male", "A"));
    manager.addStudent(Student(4, "Lisa", 1999, "Female", "C"));

    cout << "List of students:" << endl;
    manager.printStudents();

    int studentIdToRemove = 2;
    manager.removeStudent(studentIdToRemove);
    cout << "\nAfter removing student with ID " << studentIdToRemove << ":" << endl;
    manager.printStudents();

    int studentIdToFind = 3;
    Student *foundStudent = manager.findStudentById(studentIdToFind);
    if (foundStudent != nullptr) {
        cout << "\nStudent found with ID " << studentIdToFind << ": " << *foundStudent << endl;
    } else {
        cout << "\nStudent with ID " << studentIdToFind << " not found." << endl;
    }

    return 0;
}

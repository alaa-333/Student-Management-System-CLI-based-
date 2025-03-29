package StudentSystem;

public interface StudentServices {

    void AddStudent(String name , String email , String age , String department);
    void ViewAllStudents();
    void SearchStudentbyID(int id);
    void UpdateStudent(int id , String...args);
    void DeleteStudent(int id);
    void optionMenu();



}

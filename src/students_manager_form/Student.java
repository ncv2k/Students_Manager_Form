package students_manager_form;


public class Student extends User
{
    private String StudentID, Classroom;
    private float Score;

    public Student(String name, int age, String address, String StudentID, float Score, String Classroom ) {
        super(name, age, address);
        this.StudentID = StudentID;
        this.Classroom = Classroom;
        this.Score = Score;
    }

    public String getStudentID() {
        return StudentID;
    }

    public String getClassroom() {
        return Classroom;
    }

    public float getScore() {
        return Score;
    }
    
    public String getName() {
        return super.getName();
    }

    public String getAddress() {
        return super.getAddress();
    }

    public int getAge() {
        return super.getAge();
    }
    
    public String rate(){
        if(Score>=8.5) return "Gioi";
        if(Score>=6.5) return "Kha";
        return "TB";
    }

    @Override
    public String toString() {
        return "Students{" + super.toString() + ", StudentID=" + StudentID + ", Classroom=" + Classroom + ", Score=" + Score + ", Rate=" + rate() + '}';
    }
    
    
}

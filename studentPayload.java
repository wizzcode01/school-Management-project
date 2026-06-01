package schoolManagement;

public class studentPayload {
    private String name;
    private  int studentScore;
    private String subjectType;

    public studentPayload(String subjectType, int studentScore, String name){
        this.subjectType = subjectType;
        this.studentScore = studentScore;
        this.name = name;
    }

    public void viewStudents(){

    }


}

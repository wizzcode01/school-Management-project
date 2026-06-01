package schoolManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class studentManager {
    Scanner scanner;
    private String name;
    private int studentScore;
    private String type;
    ArrayList<studentPayload> payload = new ArrayList<>();


    public studentManager(String name, int studentScore){
        this.name = name;
        this.studentScore = studentScore;
    }

    public void addStudent(String name, int studentScore, String type){
       if(studentScore < 0 || studentScore > 100){
           System.out.println("Student score cannot be less than 0 or more than 100");
       }

       studentPayload payloadLists = new studentPayload(name, studentScore, type);
       payload.add(payloadLists);
    }

    public void findStudent(){

    }



}

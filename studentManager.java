package schoolManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class studentManager {
    Scanner scanner;
    private String name;
    private int studentScore;
    ArrayList<studentPayload> payload = new ArrayList<>();
    Map<String, Integer> subjectScore = new HashMap<>();
    public studentManager(String name){
        this.name = name;

    }

    public void addStudent(String name, int numberOfSubject){
        // Temporary list to hold subject names as they are entered
        ArrayList<String> temporarySubjectList = new ArrayList<>();
        for(int i = 0; i < numberOfSubject; i++){
                System.out.print("Enter the subject " + (i + 1) + ": ");
                String subject = scanner.nextLine();

                temporarySubjectList.add(subject);
        }

        for(String sub : temporarySubjectList ){
            System.out.print("Enter student score for this subject " + (sub) + ": ");
            studentScore = scanner.nextInt();
            scanner.nextLine();

            if(studentScore < 0 || studentScore > 100){
                System.out.println("Student score cannot be less than 0 or more than 100");
            }

            subjectScore.put(sub, studentScore);
        }

       studentPayload payloadLists = new studentPayload(subjectScore, name);
       payload.add(payloadLists);
    }

    public void findStudent(String name){
        boolean studentFound = false;
       for(studentPayload studentName : payload){
           if(studentName.getName().equalsIgnoreCase(name)){
               studentFound = true;
               System.out.println("Name: " + studentName.getName());
               System.out.println("Subject and Scores:");

               for(Map.Entry<String, Integer> entry : studentName.getSubjectScores().entrySet()){
                   System.out.println("  " + entry.getKey() + ": " + entry.getValue());
               }

           }
       }

       if(!studentFound){
           System.out.println("Student with name " + name + "Not found");
       }

    }



}
package schoolManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class studentManager {
    private String className;
    private int studentScore;
    ArrayList<studentPayload> payload = new ArrayList<>();
    Map<String, Integer> subjectScore = new HashMap<>();
   Scanner scanner = new Scanner(System.in);

    public studentManager(String className){
        this.className = className;
    }

    public void addStudent(String name, int numberOfSubject){
        // Temporary list to hold subject names as they are entered
        for(studentPayload s : payload){
            if(s.getName().equalsIgnoreCase(name)){
                System.out.println("Student already exists.");
                return;
            }
        }
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
       System.out.println("Student data added successfully");
    }

    public void findStudent(String name){
        boolean studentFound = false;
         name = name.trim();

       for(studentPayload studentName : payload){
           if(studentName.getName().trim().equalsIgnoreCase(name)){
               studentFound = true;
               System.out.println("Name: " + studentName.getName());
               System.out.println("Subject and Scores:");

               for(Map.Entry<String, Integer> entry : studentName.getSubjectScores().entrySet()){
                   System.out.println("  " + entry.getKey() + ": " + entry.getValue());
               }
               break;
           }
       }
        if(!studentFound){
            System.out.println("Student with name " + name + "Not found");
        }
    }

    public void viewAllStudent(){
        for(studentPayload data : payload){
            data.getViewAllStudent();
        }
    }

    public void sortStudentScore(){
       payload.sort((s1 ,s2) -> Double.compare(s2.getAverage(), s1.getAverage()));
        System.out.println("\n===== Top Performing Students =====");
        for (studentPayload s : payload) {
            System.out.println(s.getName() + " - Average: " + s.getAverage());
        }
    }




}
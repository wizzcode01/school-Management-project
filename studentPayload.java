package schoolManagement;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.Map;

public class studentPayload {
    private String name;
    private Map<String, Integer> subjectScores;

    public studentPayload(Map<String, Integer> subjectScores, String name){
        this.subjectScores = subjectScores;
        this.name = name;
    }

    public String getName(){
        return  name;
    }

    public Map<String, Integer> getSubjectScores(){
        return subjectScores;
    }

    public void getViewAllStudent(){
       System.out.println(getName() + " " + getSubjectScores());
    }

    public double getAverage(){
        int total = 0;
        for(int score : subjectScores.values()){
            total += score;
        }
        return (double) total / subjectScores.size();
    }

}

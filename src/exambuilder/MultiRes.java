package exambuilder;

import java.util.ArrayList;
import java.util.List;

public class MultiRes implements Question{
    private int QuestionType=3;
    private List<Answer> AnswerList=new ArrayList<Answer>();
    private String header;
    private int id;
    public int Point(){
        return AnswerList.size();
    }

    public void setHeader(String header){
        this.header=header;
    }

    public String getHeader(){
        return header;
    }

    public void setId(){

    }

    public void setAnswer(String keyword){
        AnswerList.add(new Answer(QuestionType,keyword));
    }
}

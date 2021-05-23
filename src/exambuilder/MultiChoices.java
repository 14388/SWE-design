package exambuilder;

import java.util.ArrayList;
import java.util.List;

public class MultiChoices implements Question {
    private int QuestionType = 2;
    private List<Answer> OptionsList = new ArrayList<Answer>();
    private String header;
    private int id;

    public int Point() { // not done
        return 1;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getHeader() {
        return header;
    }

    public void setId() {

    }

    public void setOptions(String options) {
        OptionsList.add(new Answer(QuestionType,options));
    }
}
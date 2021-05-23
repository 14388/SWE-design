package exambuilder;

public class Answer{
    private String statement;
    private int point;
    public Answer(int type,String statement){
        switch (type) {
            case 1:
            case 2:
                this.statement=statement;
                break;
            case 3:
                point=1;
                this.statement=statement;
                break;
        }
    }
    public void setPoint(){ //not done
        point=0;
    }
}

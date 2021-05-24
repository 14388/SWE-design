import java.util.ArrayList;
import java.util.List;

public class question {
    private int id;
    private static String title;
    private float point;
    private static List<option> options;
    private String type; //0:TF, 1:multi-choice, 2:multi-responds

    public static List<option> getOptions() {
        return options;
    }

    public String getType() {
        return type;
    }

    public float getPoint() {
        return point;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    private question(questionBuilder builder) {
        this.id = builder.id;
        this.point = builder.point;
        this.type = builder.type;
        this.title = builder.title;
        this.options = builder.options;
    }
///////////////////////////////////////////////////////////////////////////////////////
    public static class questionBuilder {
        private int id;
        private String title;
        private float point;
        List<option> options = new ArrayList<>();
        private String type;

        public questionBuilder(int id, String title, String type, float point) {
            this.id = id;
            this.title = title;
            this.type = type;
            this.point = point;
        }

        public questionBuilder addOption(int id, String content, boolean tof) {
            this.options.add(new option(id, content, tof));
            return this;
        }

        public question build() {
            return new question(this);
        }
    }
}

import java.util.Stack;
import java.util.List;
public class Document {
    String text;
    String header;
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void due(int due){
        System.out.println(text + " owes " + due + " to CUNY" );
    }
}

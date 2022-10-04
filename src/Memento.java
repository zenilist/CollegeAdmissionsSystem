import java.util.Stack;
public class Memento extends Document{
    Memento(Document document)
    {
        this.text = document.getText();
        this.header = document.header;
    }

}

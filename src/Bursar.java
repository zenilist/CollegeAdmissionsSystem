import java.util.Stack;
public class Bursar {
    Stack<Memento> history = new Stack<>();
    public void saveMyData(Memento memento)
    {
        history.push(memento);
    }
    public Memento restoreMyData()
    {
        return history.pop();
    }

}

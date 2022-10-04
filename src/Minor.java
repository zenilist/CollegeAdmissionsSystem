import java.util.ArrayList;

public class Minor implements Categories{

    private ArrayList<String> min=new ArrayList<>();
    @Override
    public void add(String m) {
        min.add(m);
    }
    @Override
    public int siz(){
        return min.size();


    }
    @Override
    public String value(int v){
        return min.get(v);

    }

}

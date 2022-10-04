import java.util.ArrayList;

public class Interests implements Categories{

    ArrayList<String> inter= new ArrayList<>();



    @Override
    public void add(String sub) {
        inter.add(sub);
    }
    @Override
    public int siz(){
        return inter.size();
    }
    @Override
    public String value(int v){
        return inter.get(v);

    }


}

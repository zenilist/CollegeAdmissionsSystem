import java.util.ArrayList;

public class Major implements Categories{

     private ArrayList<String> maj=new ArrayList<>();
    @Override
    public void add(String m) {
        maj.add(m);
    }
    @Override
   public int siz(){
        return maj.size();


   }
    @Override
    public String value(int v){
        return maj.get(v);

    }

}

import java.util.ArrayList;

public class Subjects implements Categories {

      private  ArrayList<String> subs = new ArrayList<String>();

      public void add(String sub){
          subs.add(sub);


      }
    @Override
    public int siz(){
        return subs.size();


    }

    @Override
    public String value(int v){
        return subs.get(v);

    }

}
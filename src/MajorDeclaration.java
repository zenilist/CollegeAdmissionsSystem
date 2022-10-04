import java.util.ArrayList;



public class MajorDeclaration {

    private String str="1";
    //private boolean check = true;
    private ArrayList<Categories> stat = new ArrayList<>();

    //add all obj of major,intersts and subjects in array
    public MajorDeclaration() {

        stat.add(new Major());
        stat.add(new Interests());
        stat.add(new Subjects());
        stat.add(new Minor());


    }

//actual programs runs
    void runPattern() {
        boolean c = true;

        //selection of major part
        System.out.println("Type your major");
        stat.get(0).add(Scan.sca());




        while(true){
            System.out.println("select \n 1 : interest \n 2 :  subjects \n 3 : minors");
            str = Scan.sca();
        switch (str) {


            case "1":
                while (true) {
                    System.out.println("add interests");
                    stat.get(1).add(Scan.sca());
                    System.out.println("will you like to add more interest");
                    if (Scan.sca().equals("y"))
                        continue;

                    break;

                }

                break;
            case "2":
                while (true) {
                    System.out.println("add subjects");
                    stat.get(2).add(Scan.sca());
                    System.out.println("will you like to add more subjects");
                    if (Scan.sca().equals("y"))
                        continue;

                    break;
                }
                break;

            case "3":
                while (true) {
                    System.out.println("add minors");
                    stat.get(3).add(Scan.sca());
                    System.out.println("will you like to add more minors");
                    if (Scan.sca().equals("y"))
                        continue;

                    break;

                }

                break;
        }
            System.out.println("do you want add more ");

            if(Scan.sca().toLowerCase().equals("y"))
                continue;
            else break;

        }

    }



    //display the whole what is saved in the array
    public void printPattern() {

        for (int k = 0; k < stat.size(); k++) {
            selectTitle(k);
            for (int i = 0; i < stat.get(k).siz(); i++)
                System.out.println(stat.get(k).value(i));

        }

    }


    // helps the display the info according to the related field
    private void selectTitle(int i){
        if(i==0) {
            System.out.println("\n 1 :major is");
            System.out.print("    ");
        }
        else if(i==1) {
            System.out.println("\n 2 :interest are");
            System.out.print("    ");
        }
        else if(i==2){
            System.out.println("\n 3 :subjects are");
            System.out.print("    ");
        }
        else if(i==3){
            System.out.println("\n 4 :minors are");
            System.out.print("    ");
        }
    }

}






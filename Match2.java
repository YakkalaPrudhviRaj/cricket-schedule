

import java.util.*;

class Match2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>al=new ArrayList<>();
        ArrayList<Object>a=new ArrayList<>();
        ArrayList<HashMap<String,String>>hs=new ArrayList<>();
        al.add("team1");
        al.add("team2");
        al.add("team3");
        al.add("team4");
        al.add("team5");
        cricket m1=new cricket(al.get(0));
        cricket m2=new cricket(al.get(1));
        cricket m3=new cricket(al.get(2));
        cricket m4=new cricket(al.get(3));
        cricket m5=new cricket(al.get(4));
        a.add(m1);
        a.add(m2);
        a.add(m3);
        a.add(m4);
        a.add(m5);

            new cricket(a);
    }
}
class cricket{
    String str;

cricket(String str)
{
    this.str=str;
}
public  String  toString()
    {
        return str;
    }
cricket(ArrayList<Object> ab){
    for (int i = 0; i < ab.size(); i++) {
        System.out.println("day " + (i + 1) + " Matches");
        for (int j = 0; j < ab.size() / 2; j++) {
            int t1 = (i + j) % (ab.size() - 1);
            int t2 = (ab.size() - 1 - j + i) % (ab.size() - 1);
            if (j == 0) {
                t2 = ab.size() - 1;
            }
            System.out.println(ab.get(t1) + "  VS  " + ab.get(t2));
        }
}
}
}
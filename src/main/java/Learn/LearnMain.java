package Learn;

import java.sql.Array;
import java.util.*;

public class LearnMain {

    public static void main(String[] args) {
        Arrays[] ysarray = new Arrays[10];

        ArrayList<String> temp = new ArrayList<>();

        LinkedList<String> temp1 = new LinkedList<>();
        HashMap<Integer,String> temp2 = new HashMap<Integer,String>();

        temp2.put(1,"E");
        temp2.put(2,"A");
        temp2.put(2,"M");
        temp2.put(3,"N");
        temp2.put(7,"C");
        temp2.put(5,"D");

        for (Integer abc: temp2.keySet()) {
            System.out.println("key =: " +abc + " gias tri = "   +temp2.get(abc));
        }
        System.out.println(temp2.values());

        System.out.println("Test Map");
        Map<LangKey, String> langMap = new HashMap<LangKey, String>();
        langMap.put(new LangKey(1, "EN"), "English");
        langMap.put(new LangKey(2, "VI"), "Vietnamese");
        langMap.put(new LangKey(3, "ES"), "Spainish");
        langMap.put(new LangKey(4, "JP"), "Jaspanese");
        langMap.put(null, "Jaspanese");

        System.out.println("Size cua langMap la: " + langMap.size());
        System.out.print("Cac phan tu cua langMap: ");
        Iterator<LangKey> itr = langMap.keySet().iterator();
        while (itr.hasNext()) {
            System.out.print(langMap.get(itr.next()) + " ");
        }
        System.out.println("\nSize cua langMap la: " + langMap.size());
    }
}

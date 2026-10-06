import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class File7 {
    public static void main(String[] args) {
        
      Map<String, String> mpp = new HashMap<>();
      mpp.put("1", "raj");
      mpp.put("2", "ace");
      System.out.println(mpp);

      Map<String, String> m = new HashMap<>();
      m.put("3", "betu");

      m.putAll(mpp);

      System.out.println(m);

      m.remove("3");
      System.out.println(m);

      m.clear();

      m.putIfAbsent("3", "bete");
      System.out.println(m);

      System.out.println(m.get("3"));
      System.out.println(m.getOrDefault("4", "None"));

      System.out.println(m.containsKey("3"));

      m.replace("3", "bell");

       Set<String> s = m.keySet();
       System.out.println(s);

       Collection<String> v = m.values();
       System.out.println(v);

       Set<Entry<String, String>> en = m.entrySet();
       System.out.println(en);

    }
}

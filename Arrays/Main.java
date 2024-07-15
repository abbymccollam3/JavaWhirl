
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<>();

        map.put("CA", "Sac");
        map.put("WA", "Sal");
        System.out.println(map);

        String cap = map.get("CA");
        System.out.println(cap);

        map.remove("CA");
        System.out.println(map);

    }
    
}

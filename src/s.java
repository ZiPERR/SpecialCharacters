import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class s {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> multiValueMap = new HashMap<String, ArrayList<String>>();

        multiValueMap.put("ford", new ArrayList<>());
        multiValueMap.get("ford").add("GT");
        multiValueMap.get("ford").add("Mustang Mach-E");
        multiValueMap.get("ford").add("Pantera");
        System.out.println(multiValueMap);
    }
}

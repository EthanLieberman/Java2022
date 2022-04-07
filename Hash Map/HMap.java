import java.util.HashMap;
import java.util.Set;

public class HMap {

	public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("mind melt", "o man java he a coming");
        map.put("sweet relaxation", "a lone bit of code finally comin home");
        map.put("boom", "code like ooh ahh, dynomite!");
        map.put("livewire", "riding the rails of an epic masterpiece");

        System.out.println(map.get("boom"));

        Set<String> keys = map.keySet();

        for (String key : keys){
            System.out.println(key);
            System.out.println(map.get(key));
        }

	}
}
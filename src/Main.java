
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        String key;
        Integer value;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            while (true) {
                key = reader.readLine();
                if (key.equals("end")) break;
                value =Integer.parseInt(reader.readLine());
                map.put(key,value);
            }

            Gson gson = new Gson();
            String json = gson.toJson(map);
            System.out.println(json);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}

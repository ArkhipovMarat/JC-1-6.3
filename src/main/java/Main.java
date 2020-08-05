import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String jsonFilePath = "data.json";
        readJson(jsonFilePath);
    }

    private static void readJson (String jsonFilePath) throws FileNotFoundException {
        FileReader reader = new FileReader(jsonFilePath);
        Gson gson = new Gson();
        Employee[] employees = gson.fromJson(reader, Employee[].class);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

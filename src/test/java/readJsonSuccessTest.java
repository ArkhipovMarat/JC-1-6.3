import com.google.gson.Gson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class readJsonSuccessTest {
    @Test
    void readJson() throws FileNotFoundException {
        FileReader originalReaderJson = new FileReader("data.json");
        Gson gson = new Gson();
        Assertions.assertNotNull(gson.fromJson(originalReaderJson, Employee[].class));
    }
}

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DesserializaJSON {
    public static void main(String[] args) throws Exception {
        File file = new File("livros.json");
        ObjectMapper objectMapper = new ObjectMapper();
        Livros l = objectMapper.readValue(file, Livros.class);
        System.out.println(l);
    }
}

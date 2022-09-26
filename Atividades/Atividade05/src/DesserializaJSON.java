import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DesserializaJSON {
    public static void main(String[] args) throws Exception {
        File file = new File("Livros.json");
        ObjectMapper ObjectMapper = new ObjectMapper();
        Livros l = ObjectMapper.readValue(file, Livros.class);
        System.out.println(l);
    }
}

import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class DesserializaXML {
    public static void main(String[] args) throws Exception {
        File file = new File("livros.xml");
        XmlMapper xmlMapper = new XmlMapper();
        Livros l = xmlMapper.readValue(file, Livros.class);
        System.out.println(l);
    }
}

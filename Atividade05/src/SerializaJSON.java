import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializaJSON {
    public static void main(String[] args) throws Exception {
        Livro l1 = new Livro(1, "Eu que nunca conheci os homens", "Jacqueline Harpman");
        Livro l2 = new Livro(2, "A paciente silenciosa", "Alex Michaelides");
        Livro l3 = new Livro(3, "A vida invisível de Addie Larue", "V.E. Schwab");
        List<Livro> lista = new ArrayList<Livro>();
        lista.add(l1);
        lista.add(l2);
        lista.add(l3);
        Livros livros = new Livros(lista);
        File f = new File("livros.xml");

        ObjectMapper xm = new ObjectMapper();
        xm.enable(SerializationFeature.INDENT_OUTPUT);
        xm.writeValue(f, livros);

    }
}

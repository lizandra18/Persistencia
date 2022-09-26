import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Desserializa {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream is = new FileInputStream("Livros.txt");
            ObjectInputStream Ois = new ObjectInputStream(is);
            List<Livro> livros = (List<Livro>) Ois.readObject();
            System.out.println(livros);
            Ois.close();

        }catch(Exception i) {
            i.printStackTrace();
        }
    }
}
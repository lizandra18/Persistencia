import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;

public class Serializa {
    public static void main(String[] args) throws IOException {
        Livro livro = new Livro(1, "Skyward: Conquiste as Estrelas", "Brandon Sanderson", "Planeta Minotauro");
        Livro nLivro = new Livro(3, "A Casa no Mar Cerúleo", "TJ Klune", "Morro Branco");

        List<Livro> lista = new ArrayList<>();
        lista.add(livro);
        lista.add(nLivro);

        try {
            FileOutputStream fo = new FileOutputStream("Livros.txt");
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(lista);
            out.close();
            System.out.println("Serializado");
        }catch(IOException i){
            i.printStackTrace();
        }
    }
}
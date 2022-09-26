import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Lista de Desejos")
public class Livros {

    private List<Livro> livros;

    public Livros() {}

    public Livros(List<Livro> livros) {
        this.livros = livros;
    }

    @JacksonXmlElementWrapper(localName = "livros")
    @JacksonXmlProperty(localName = "livro")
    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }


    @Override
    public String toString() {
        return this.livros.toString();
    }

}

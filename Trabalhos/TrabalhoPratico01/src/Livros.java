import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Lista De Livros")

public class Livros {
    private List<Skoob> livro;

    public Livros(){
    }

    public Livros(List<Skoob> livro) {
        this.livro = livro;
    }

    @JacksonXmlElementWrapper(localName = "Livros")
    @JacksonXmlProperty(localName = "livro")

    public List<Skoob> getLivro() {
        return livro;
    }

    public void setLivro(List<Skoob> livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return this.livro.toString();        
    }

}
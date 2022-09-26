/*
1. Defina uma entidade principal com pelo menos 5 atributos e relacionada a um domínio de problema. Crie também uma classe Java para representá-la.
Exemplo de entidade com 9 atributos: Cliente: id, nome, cpf, endereço, email, fone, cidade, uf, cep. A entidade deve estar relacionada a algo que
você gosta bastante como: hobie, esporte, pet, alimentação, educação, música, filmes, séries, redes sociais, etc. A entidade escolhida por você não
pode ser a entidade Cliente dada como exemplo. Escolha uma entidade bem diferente dela, inclusive quanto aos seus atributos.*/ 

import java.io.Serializable;

public class Skoob implements Serializable {
    String titulo;
    String autor;
    int paginas;
    String editora;
    int dataLancamento;
    String idioma;
 
    public Skoob(String titulo, String autor, int paginas, String editora, int dataLancamento, String idioma){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.editora = editora;
        this.dataLancamento = dataLancamento;
        this.idioma = idioma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(int dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Skoob [autor=" + autor + ", dataLancamento=" + dataLancamento + ", editora=" + editora + ", idioma="
                + idioma + ", paginas=" + paginas + ", titulo=" + titulo + "]";
    }

}
    

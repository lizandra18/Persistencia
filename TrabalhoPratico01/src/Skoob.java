public class Skoob {
    private int id;
    private String titulo;
    private String autor;
    private int paginas;
    private String dataLancamento;
    private String idioma;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getDataLancamento() {
        return dataLancamento;
    }
    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getIdioma(){
        return idioma;
    }

    public void setIdioma(String idioma){
        this.idioma = idioma;
    }


    @Override
    public String toString() {
        return "Skoob [autor=" + autor + ", dataLancamento=" + dataLancamento + ", id=" + id + ", idioma=" + idioma
                + ", paginas=" + paginas + ", titulo=" + titulo + "]";
    }
    

}

public class Livro {
    private int id;
    private String titulo;
    private String autor;

    public Livro() {}

    public Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
    
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

    @Override
    public String toString() {
        return "{id: " + this.id + ", titulo: " + this.titulo + ", autor: " + this.autor + "}";
    }

}

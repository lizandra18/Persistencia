public class Livro implements java.io.Serializable {
    private int id;
    private String titulo;
    private String autor;
    private String editora;

    Livro(int id, String titulo, String autor, String editora){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public int getID(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getEditora(){
        return editora;
    }

    public void setEditora(String editora){
        this.editora = editora;
    }

    public String toString(){
        return "Livro [id:" + id + ", Titulo: " + titulo + ", Autor: " + autor + ", Editora: " + editora + "]";
    }
}
/* 2. Crie uma classe Java para cadastrar dados relacionados à entidade
definida na questão 1. A classe deve receber dados via teclado e os
salvar em um arquivo JSON. */

import java.util.Scanner;
import java.io.File;
import java.util.List;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Serializando {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String titulo = "titulo";
        String autor = "autor";
        int paginas = 0;
        String editora = "editora";
        int dataLancamento = 0;
        String idioma = "idioma";

        List<Skoob> lista = new ArrayList<Skoob>();
        Livros skoob = new Livros(lista);
    
        File f = new File("Skoob.json");

        System.out.println("Titulo do Livro:");
        titulo = scan.nextLine();
        System.out.println("Nome do autor:");
        autor = scan.nextLine();
        System.out.println("Quantidade de paginas:");
        paginas = scan.nextInt();
        scan.nextLine();
        System.out.println("Editora:");
        editora = scan.nextLine();
        System.out.println("Data de Lancamento:");
        dataLancamento = scan.nextInt();
        scan.nextLine();
        System.out.println("Idioma:");
        idioma = scan.nextLine();

        Skoob skoobs = new Skoob(titulo, autor, paginas, editora, dataLancamento, idioma);
        lista.add(skoobs);
        ObjectMapper om = new ObjectMapper();
        om.enable(SerializationFeature.INDENT_OUTPUT);
        om.writeValue(f, skoob);

        scan.close();
    }
}

/*3 Crie uma classe Java que recebe via linha de comando o nome de um arquivo qualquer em formato
JSON e o converte para os formatos CSV e XML. */

import java.io.File;
import java.io.Writer;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;


public class ConvertendoCsvXml {
    public static void main(String[] args) throws Exception, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException{
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome do arquivo JSON que será convertido para CSV e XML:");
        
        File file = new File(scan.next());
        ObjectMapper Objectmapper = new ObjectMapper();
        Livros livros = Objectmapper.readValue(file,Livros.class);
        
        File f = new File("Skoob.xml");
        XmlMapper xm = new XmlMapper();
        xm.enable(SerializationFeature.INDENT_OUTPUT);
        xm.writeValue(f, livros);
        
        Writer writer = Files.newBufferedWriter(Paths.get("Skoob.csv"));
        StatefulBeanToCsv<Livros> stateful = new StatefulBeanToCsvBuilder<Livros>(writer).build();
        stateful.write(livros);

        writer.flush();
        writer.close();
        scan.close();
    }
}

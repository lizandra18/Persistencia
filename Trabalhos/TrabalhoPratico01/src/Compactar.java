/*4. Crie uma classe Java que recebe como entrada de teclado o nome de um file qualquer e o compacta para o formato ZIP ou outro formato de compressão à sua escolha. */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Compactar { 
        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int cont;
        
        System.out.println("Digite o nome do Arquivo: ");
        String nome = scanner.nextLine();
        File file = new File(nome);
        String Arquivo =  nome.substring(0, nome.lastIndexOf('.')).concat(".zip");
        byte[] qtd = Files.readAllBytes(Paths.get(nome));

        FileOutputStream outputStream = new FileOutputStream(new File(Arquivo));
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(outputStream));
        FileInputStream InputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(InputStream, qtd.length);
        ZipEntry zipEntry = new ZipEntry(file.getName());
        zipOutputStream.putNextEntry(zipEntry);

        while ((cont = bufferedInputStream.read(qtd, 0, qtd.length)) != -1) {
            zipOutputStream.write(qtd, 0, cont);
        }

        bufferedInputStream.close(); 
        zipOutputStream.close();
        scanner.close();
    }
}
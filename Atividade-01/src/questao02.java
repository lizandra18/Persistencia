import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        InputStream arquivoOrigem = new FileInputStream(args[0]);
        OutputStream arquioDestino = new FileOutputStream(args[1]);
        
        Scanner entrada = new Scanner(arquivoOrigem);

        while (entrada.hasNextLine()) {
            String linha = entrada.nextLine() + "\n";

            for(int i = 0; i < linha.length(); i++){
                arquioDestino.write(linha.charAt(i));
            }
        }

        arquivoOrigem.close();
        arquioDestino.close();
        entrada.close();
        teclado.close();
    }
}

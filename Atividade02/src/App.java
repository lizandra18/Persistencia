import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo");
        String arquivo1 = entrada.nextLine();
        System.out.println("Digite a sub string");
        String subS = entrada.nextLine();

        InputStream is = new FileInputStream(arquivo1);
        Scanner ler = new Scanner(is);

        while(ler.hasNextLine()){
            String aux = ler.nextLine();
            if(aux.contains(subS)){
                System.out.println(aux);
            }
        }
        entrada.close();
        ler.close();
    }
}

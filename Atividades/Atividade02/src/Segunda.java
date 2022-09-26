import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.io.PrintStream;

public class Segunda {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo");
        String arquivo1 = entrada.nextLine();
        System.out.println("Digite o nome do segundo arquivo");
        String arquivo2 = entrada.nextLine();
        System.out.println("Digite o nome do terceiro arquivo");
        String arquivo3 = entrada.nextLine();

        InputStream is = new FileInputStream(arquivo1);
        Scanner ler = new Scanner(is);
        InputStream is2 = new FileInputStream(arquivo2);
        Scanner ler2 = new Scanner(is2);
        
        PrintStream ps = new PrintStream(arquivo3);

        while(ler.hasNextLine() || ler2.hasNextLine()){
            if(ler.hasNextLine()){
                ps.println(ler.nextLine());
            }else{
                ps.println(ler2.nextLine());
            }
        }
        entrada.close();
        ler.close();
        ler2.close();
        ps.close();
    }
}

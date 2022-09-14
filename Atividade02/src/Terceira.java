import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Terceira {

    private static Properties config = new Properties();
    private static String root = "src\\config.properties";

    public static void main(String[] args) throws FileNotFoundException, IOException {

        config.load(new FileInputStream(root));
    
        InputStream is = new FileInputStream(config.getProperty("arquivo"));
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String str = "";


        int n1 = Integer. parseInt(config.getProperty("linha_inicial"));
        int n2 = Integer. parseInt(config.getProperty("linha_final"));
        

        if (n2 == 0) {
            for (int i = 0; str != null; i++) {
                if (i >= (n1))
                    System.out.println(str);
                str = br.readLine();
            }
        }

        else if (n1 > n2) System.out.println("Operação invalida!!! Atenção com os valores inseridos");

        else if (n1 < n2) {
            for (int i = 0; i <= (n2); i++) {
                if (i >= (n1))
                    System.out.println(str);
                str = br.readLine();
            }
        }

        br.close();
    }
}
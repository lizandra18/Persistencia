
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo: ");
        String caminho = teclado.nextLine();
        System.out.print("Digite a primeira linha: ");
        String primeiraLinha = teclado.nextLine();
        System.out.print("Digite a ultima linha: ");
        String ultimaLinha = teclado.nextLine();

        int n1 = primeiraLinha.isEmpty() ? 0 : Integer.parseInt(primeiraLinha);
        int n2 = ultimaLinha.isEmpty() ? 0 : Integer.parseInt(ultimaLinha);

        InputStream arquivo = new FileInputStream(caminho);
        Scanner entrada = new Scanner(arquivo);

        int i = 1;
        while(entrada.hasNextLine()) {
            if((n1 <= 0 && n2 <= 0) || (n1 <= 0 && n2 > 0 && i <= n2)|| (n1 > 0 && n2 <= 0 && i >= n1)|| (n1 > 0 && n2 > 0 && i >= n1 && i <= n2)){
                System.out.println(entrada.nextLine());
            }else{
                entrada.nextLine();
            }

            i++;
        }

        if(n1 > n2) {
            System.out.println("Informe valores em ordem crescente.");
        }

        arquivo.close();
        entrada.close();
        teclado.close();
    }
}

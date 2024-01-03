import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite a lista de nomes:");
        String nome = s.nextLine();
        List<String> array = new ArrayList<String>();
        array.add(nome);
        List<String> array2 = new ArrayList<String>();
        String[] nomeSeparado = nome.split(",");
        for(String elemento : nomeSeparado){
            array2.add(elemento.trim());
            Collections.sort(array2);
            System.out.println(array2);
        };

        Scanner ss = new Scanner(System.in);
        System.out.println("Digite a lista de nomes-sexo:");
        String nomeESexo = ss.nextLine();
        List<String> nomeMF = new ArrayList<String>();
        nomeMF.add(nomeESexo);
        String[] separandoTudo = nomeESexo.split(",");
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();
        for(String elementos : separandoTudo){
            String[] separandoPorSexo = elementos.split("-");
            String nomee = separandoPorSexo[0].trim();
            String sexo = separandoPorSexo[1].trim();

            if ("m".equalsIgnoreCase(sexo)) {
                masculinos.add(nomee);
            } else if ("f".equalsIgnoreCase(sexo)) {
                femininos.add(nomee);
            }
        }

        // Imprimir listas separadas por sexo
        System.out.println("Masculinos: " + masculinos);
        System.out.println("Femininos: " + femininos);

        }

    }


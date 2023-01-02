import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int qtdNumeros = 0;
        int numDigitado;
        Scanner sc = new Scanner( System.in );
        List<List<Integer>> vetorCriado = new ArrayList<>();
        ArrayList<Integer> numeroDigitadoUsuario = new ArrayList<>();

        while(qtdNumeros == 0) {
            System.out.print("Quantos numeros deseja incluir? (max: 4, min: 2) ");
            qtdNumeros = sc.nextInt();

            if (qtdNumeros < 2 || qtdNumeros > 4){
                System.out.println("A quantidade minima e 2 e a quantidade maxima e 4.");
                qtdNumeros = 0;
            }
        }

        for(int i = 0; i < qtdNumeros; i++){
            System.out.print("Digite o numero do elemento ("+ (i + 1) +"):");
            numDigitado = sc.nextInt();
            numeroDigitadoUsuario.add(numDigitado);
        }

        //aqui insere o numero digitado no vetor
        ManipulaSubSet.getSubsets(vetorCriado, numeroDigitadoUsuario, new ArrayList<>(), 0);
        //faz um sort no vetor
        ManipulaSubSet.ordenarSubSet(vetorCriado);
        //imprime o vetor na tela
        ManipulaSubSet.imprimirSubSet(vetorCriado);
    }
}

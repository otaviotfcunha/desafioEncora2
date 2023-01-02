import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ManipulaSubSet {
    public static void getSubsets(List<List<Integer>> vetor, ArrayList<Integer> numeros, ArrayList<Integer> saida, int index)
    {
        // Verifica se o index e o primeiro para atualizar o vetor
        if (index == numeros.size()) {
            vetor.add(saida);
            return;
        }else{
            getSubsets(vetor, numeros, new ArrayList<>(saida), index + 1);
            saida.add(numeros.get(index));
            getSubsets(vetor, numeros, new ArrayList<>(saida), index + 1);
        }
    }
    public static void ordenarSubSet(List<List<Integer>> vetor){
        vetor.sort((o1, o2) -> {
            int n = Math.min(o1.size(), o2.size());
            for (int i = 0; i < n; i++) {
                if (Objects.equals(o1.get(i), o2.get(i))) {
                    continue;
                } else {
                    return o1.get(i) - o2.get(i);
                }
            }
            return o1.size() - o2.size();
        });
    }
    public static void imprimirSubSet(List<List<Integer>> vetor){
        System.out.println("########## POSSIBILIDADES DE COMBINACOES ##########");
        for (int i = 0; i < vetor.size(); i++) {
            for (int j = 0; j < vetor.get(i).size(); j++) {
                System.out.print(vetor.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("##################################################");
    }
}

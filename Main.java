import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> newNumbers = new ArrayList<>();

        // Receber os valores
        numbers.addAll(receberValores());

        System.out.println("Lista original: " + numbers);

        for (int i = 0; i < numbers.size(); i++) {
            int atual = numbers.get(i);
            int posicao = 0;

            while (posicao < newNumbers.size() && atual > newNumbers.get(posicao)) {
                posicao++;
            }

            newNumbers.add(posicao, atual);
        }

        System.out.println("Lista ordenada: " + newNumbers);
    }

    public static ArrayList<Integer> receberValores() {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("NUMERO " + (i + 1) + ": ");
            lista.add(sc.nextInt());
        }

        sc.close();
        return lista;
    }
}

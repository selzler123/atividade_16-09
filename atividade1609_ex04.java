import java.util.Scanner;

public class atividade1609_ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = input.nextInt();
        input.nextLine();

        System.out.print("Digite o tamanho da pizza (broto, pequena, média, grande): ");
        String tamanhoPizza = input.nextLine().toLowerCase();

        int pessoasPorPizza;
        switch (tamanhoPizza) {
            case "broto":
                pessoasPorPizza = 1;
                break;
            case "pequena":
                pessoasPorPizza = 2;
                break;
            case "média":
                pessoasPorPizza = 3;
                break;
            case "grande":
                pessoasPorPizza = 4;
                break;
            default:
                System.out.println("Tamanho de pizza inválido.");
                input.close();
                return;
        }

        
        int pizzasNecessarias = quantidadePessoas / pessoasPorPizza;
        if (quantidadePessoas % pessoasPorPizza != 0) {
            pizzasNecessarias++;
        }

        
        System.out.println("Você precisará de " + pizzasNecessarias + " pizza(s) do tamanho " + tamanhoPizza + ".");

        input.close();
    }
}

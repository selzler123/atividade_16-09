import java.util.Scanner;

public class atividade1609_ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso atual em kg: ");
        double pesoAtual = scanner.nextDouble();

        System.out.print("Digite seu sexo (M para homens, F para mulheres): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        
        try {
            double pesoIdeal = calcularPesoIdeal(altura, sexo);
            String resultado = verificarPeso(pesoAtual, pesoIdeal);

            
            System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
            System.out.println(resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        
    }

    public static double calcularPesoIdeal(double altura, char sexo) {
        double pesoIdeal;

        switch (sexo) {
            case 'M':
                
                pesoIdeal = (72.7 * altura) - 58;
                break;
            case 'F':
                
                pesoIdeal = (62.1 * altura) - 44.7;
                break;
            default:
                throw new IllegalArgumentException("Sexo inválido. Use 'M' para homens ou 'F' para mulheres.");
        }

        return pesoIdeal;
    }

    public static String verificarPeso(double pesoAtual, double pesoIdeal) {
        if (pesoAtual < pesoIdeal) {
            return "Abaixo do peso ideal";
        } else if (pesoAtual == pesoIdeal) {
            return "No peso ideal";
        } else {
            return "Acima do peso ideal";
        }
    }
}

import java.util.Scanner;

public class atividade1609_ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: ");
        double valorTotal = scanner.nextDouble();

        System.out.print("Digite o código da condição de pagamento (1 a 4): ");
        int codigoPagamento = scanner.nextInt();

        double valorAPagar;
        int quantidadeParcelas;
        double valorPorParcela;

        switch (codigoPagamento) {
            case 1:
                
                valorAPagar = valorTotal * 0.90; 
                quantidadeParcelas = 1;
                valorPorParcela = valorAPagar; 
                break;
            case 2:
                
                valorAPagar = valorTotal * 0.92; 
                quantidadeParcelas = 1;
                valorPorParcela = valorAPagar; 
                break;
            case 3:
                
                valorAPagar = valorTotal; 
                quantidadeParcelas = 5;
                valorPorParcela = valorAPagar / quantidadeParcelas;
                break;
            case 4:
                
                valorAPagar = valorTotal * 1.05; 
                quantidadeParcelas = 10;
                valorPorParcela = valorAPagar / quantidadeParcelas;
                break;
            default:
                System.out.println("Código de pagamento inválido.");
                scanner.close();
                return;
        }

        System.out.printf("Valor total a ser pago: R$ %.2f%n", valorAPagar);
        System.out.printf("Quantidade de parcelas: %d%n", quantidadeParcelas);
        System.out.printf("Valor por parcela: R$ %.2f%n", valorPorParcela);

        
    }
}

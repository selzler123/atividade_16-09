import java.util.Scanner;

public class atividade1609_ex01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        
        int mesAtualNumero = 9;

        
        System.out.print("Digite o número do mês (1 a 12): ");
        int mesNumero = scanner.nextInt();

        
        if (mesNumero < 1 || mesNumero > 12) {
            System.out.println("Valor Inválido");
        } else {
           
            String mes = meses[mesNumero - 1];
            System.out.println("Mês: " + mes);

           
            if (mesNumero < mesAtualNumero) {
                System.out.println("Mês já passou");
            } else if (mesNumero == mesAtualNumero) {
                System.out.println("É mês atual");
            } else {
                System.out.println("Mês Futuro");
            }
        }

        
        scanner.close();
    }
}

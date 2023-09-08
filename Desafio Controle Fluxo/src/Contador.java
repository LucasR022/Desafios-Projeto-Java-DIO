import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int primeiroParametro = scan.nextInt();
        
        System.out.print("Digite o segundo parâmetro: ");
        int segundoParametro = scan.nextInt();
        
        try {
            contar(primeiroParametro, segundoParametro);
            
        } catch (ParametroInvalidosExcepetion e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }


    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametroInvalidosExcepetion {
        if (primeiroParametro > segundoParametro) {
            throw new ParametroInvalidosExcepetion();
        }
        
        int contagem = segundoParametro - primeiroParametro;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo número " + i);
        }

    }
}

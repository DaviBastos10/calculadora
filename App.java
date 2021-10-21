import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int operacao, primeiroN, segundoN;

        System.out.println("Digite a operação desejada: (soma = 1, sub = 2, div = 3, mult = 4");
        operacao = entrada.nextInt();

        System.out.println("Digite o primeiro número da operação:");
        primeiroN = entrada.nextInt();

        System.out.println("Digite o segundo número da operação:");
        segundoN = entrada.nextInt();

        if (operacao == 1){
      System.out.println("O resultado de sua operação é:"+ (primeiroN + segundoN));
        }
        
        if (operacao == 2){
          System.out.println("O resultado de sua operação é:"+ (primeiroN - segundoN));
        }
       
        if (operacao == 3){
          System.out.println("O resultado de sua operação é:"+ (primeiroN / segundoN));
        }

        if (operacao == 4){
          System.out.println("O resultado de sua operação é:"+ (primeiroN * segundoN));
        }
        else{
          System.out.println("O código de operação é inválido! ;)");
        }

       
       
       
     entrada.close();
    }
}

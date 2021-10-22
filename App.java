import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int operacao, primeiroN, segundoN;

        do{

          System.out.println("\n~~~~~~~~~~~\nCALCULADORA\n~~~~~~~~~~~\n");
          System.out.println("Para soma digite 1");
          System.out.println("Para subtração digite 2");
          System.out.println("Para divisão digite 3");
          System.out.println("Para multiplicação digite 4");
          System.out.println("Para sair digite 0\n~~~~~~~~~~~~\n");
          System.out.println("Digite a operação desejada:");

          operacao = entrada.nextInt();

          if (operacao != 0){
                       
            
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
          
      }
    } while (operacao != 0); 
                     
     entrada.close();
    }
  }
import fatec.poo.model.ContaCorrente;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int numConta, opcao;
        double dindin;
        opcao = 0;
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        System.out.println("Digite o numero da conta:");
        numConta = entrada.nextInt();
        System.out.println("Digite o saldo:");
        dindin = entrada.nextDouble();
        System.out.println("\n\n");
        
        ContaCorrente objCCorrente = new ContaCorrente(numConta,dindin);
        //System.out.flush();
        
        
        
        
        do { 
            
            System.out.println("************************");
            System.out.println("*****Hello My Friend*****");
            System.out.println("************************");
            System.out.println("\n\n");
        
            System.out.println("1 - Exibir numero da conta corrente");
            System.out.println("2 - Exibir saldo");
            System.out.println("3 - Sacar dinheiro");
            System.out.println("4 - Depositar dinheiro");
            System.out.println("5 - Sair");
            System.out.print("\n\n\t Digite a opcao: ");
            opcao = entrada.nextInt();
            System.out.println("\n");  

            switch (opcao) {
                case 1: /*Exibir numero da conta*/
                    System.out.println(objCCorrente.getNumero());
                    
                    break;

                case 2:/*Exibir saldo*/
                    System.out.println(df.format(objCCorrente.getSaldo()));
                    break;

                case 3: /*Sacar Dinheiro*/
                    double dinSac;
                    System.out.println("Digite o valor que deseja sacar:");
                    dinSac = entrada.nextDouble();
                    if (dinSac > objCCorrente.getSaldo())
                    {
                    System.out.println("N??o ?? possivel sacar! valor do saque ?? maior que saldo!!");
                    System.out.println("Seu saldo atual ?? de apenas " + objCCorrente.getSaldo());
                    }
                    else
                    {
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("Seu saldo anterior era de " + objCCorrente.getSaldo() + " Reais");
                    objCCorrente.sacar(dinSac); 
                    System.out.println("Voc?? sacou " + dinSac + " e agora seu saldo ?? de "+ objCCorrente.getSaldo() + " Reais");
                    }
                    
                    
                    break;
                    
                case 4: /*Depositar Dinheiro*/
                    double dinDep;
                    System.out.println("Digite o valor que deseja sacar:");
                    dinDep = entrada.nextDouble();
                    
                  
                    System.out.println("Deposito realizado com sucesso!");
                    System.out.println("Seu saldo anterior era de " + objCCorrente.getSaldo() + " Reais");
                    objCCorrente.depositar(dinDep);
                    System.out.println("Voc?? depositou " + dinDep + " Seu saldo atual agora ?? de " + objCCorrente.getSaldo() + " Reais");
                    
                    break;
            }
           
        System.out.println("************************");
        System.out.println("\n\n");  
        } while (opcao < 5);
        
        }
        
    }
    


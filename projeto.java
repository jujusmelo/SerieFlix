import java.util.Scanner;


public class projeto {
    private static String valorFinal;

    public static void main(String[] args) {
        boolean continuar = true;
        Scanner sc = new Scanner (System.in);

        int opcaoPlano;
        int resp;
        int opcaoPg;
        double preco = 0;
        
        

        do {
            
            System.out.println("***** PLANOS *****\n");
            System.out.println("¨¨ Escolha o plano desejado: ¨¨  \n");
            System.out.println("1- Plano Basic (R$12,00) \n");
            System.out.println("2- Plano Duo (R$20,00) \n");
            System.out.println("3- Plano Silver (R$26,00) \n");
            System.out.println("4- Plano Premium (R$43,00 \n");
            
            System.out.println("Digite a opção desejada: ");
            opcaoPlano = sc.nextInt();
            
            if(opcaoPlano==1){
                System.out.println("Você escolheu o Plano Basic (R$12,00). \n");
                continuar=false;
                preco = 12.00;
                    System.out.println("Deseja ir para o pagamento?");
                    System.out.println("Digite 1 para SIM e 2 para NÃO.");
                    resp= sc.nextInt(); 
                    if(resp==1){
                    continuar=true;
                }if(resp==2){
                    System.out.println("Programa encerrado.");
                    break;
            }
            }

            if(opcaoPlano==2){
                System.out.println("Você escolheu o Plano Duo (R$20,00) \n");
                continuar=false;
                preco= 20.00;
                System.out.println("Deseja ir para o pagamento?");
                System.out.println("Digite 1 para SIM e 2 para Não.");
                resp= sc.nextInt(); 
                if(resp==2){
                    continuar=true;
                }if(resp==2){
                    System.out.println("Programa encerrado.");
                    break;
            }
            }

            if(opcaoPlano==3){
                System.out.println("Você escolheu o Plano Silver (R$26,00) \n");
                continuar=false;
                preco = 26.00;
                System.out.println("Deseja ir para o pagamento?");
                System.out.println("Digite 1 para SIM e 2 para NÃO.");
                resp= sc.nextInt(); 
                if(resp==1){
                    continuar=true;
                }if(resp==2){
                    System.out.println("Programa encerrado.");
                    break;
            }
            }

            if(opcaoPlano==4){
                System.out.println("Você escolheu o Plano Premium (R$43,00) \n");
                continuar=false;
                preco = 43.00;
                System.out.println("Deseja ir para o pagamento?");
                System.out.println("Digite 1 para SIM e 2 para NÃO.");
                resp= sc.nextInt(); 
                if(resp==1){
                    continuar=true;
                }if(resp==2){
                        continuar=false;
                }
            }
            
                System.out.println("***** PAGAMENTO *****\n");
                System.out.println("¨¨ Escolha a forma de pagamento desejada: ¨¨  \n");
                System.out.println("1- PIX. \n");
                System.out.println("2- Teste. \n");
                System.out.println("3- Cartão de Crédito. \n");
                System.out.println("4- Cartão de Débito. \n");

                System.out.println("Digite a opção de pagamento desejada: ");
            opcaoPg = sc.nextInt();

            if(opcaoPg==1){
                System.out.println("Forma de pagamento: PIX.\n");
                double valorFinal = preco; 
                if (opcaoPg == 1 || opcaoPg == 4) {
                    valorFinal = valorFinal-(valorFinal * 0.1);
                    System.out.println("O valor do plano escolhido é: R$"+valorFinal);
                } else if (opcaoPg == 3) {
                    
                    valorFinal = (valorFinal * 0.05)+valorFinal;
                    System.out.println("O valor do plano escolhido é: R$"+valorFinal);
                
                }
            }
            

            if(opcaoPg==2){
                System.out.println("Forma de pagamento: Transferência Bancária. \n");
                
                System.out.println("O valor do plano escolhido é: R$" +valorFinal);

               
        
          }

                
                
                if(opcaoPg==3){
                System.out.println("Forma de pagamento: Cartão de Crédito.\n");
                double valorFinal = preco;
                if (opcaoPg == 1 || opcaoPg == 4) {
                    valorFinal = valorFinal-(valorFinal * 0.1);
                    System.out.println("O valor do plano escolhido é: R$"+valorFinal);
                } else if (opcaoPg == 3) {
                    
                    valorFinal = (valorFinal * 0.05)+valorFinal;
                    System.out.println("O valor do plano escolhido é: R$"+valorFinal);
        
          }
            }
                
                if(opcaoPg==4){
                System.out.println("Forma de pagamento: Cartão de Débito. \n");
                double valorFinal = preco;
                 
               if (opcaoPg == 1 || opcaoPg == 4) {
                    valorFinal = valorFinal-(valorFinal * 0.1);
                    System.out.println("O valor do plano escolhido é: R$"+valorFinal);
                } else if (opcaoPg == 3) {
                    
                    valorFinal = (valorFinal * 0.05)+valorFinal;
                    System.out.println("O valor do plano escolhido é: R$"+valorFinal);
        
          }
            }
        
                continuar=false;
                resp= sc.nextInt(); 
                if(resp==1){
                    continuar=true;
              
              
                    break;
                }
            } while(continuar);
        } 
    }


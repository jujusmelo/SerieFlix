import java.util.Scanner;
import java.util.ArrayList;




public class projetoFinal {

public static void main(String[] args) {

ArrayList<String> titulos = new ArrayList<>();

ArrayList<String> generos = new ArrayList<>();

boolean continuar = true;
int opc;
int resp;
String genero = "";
String titulo = "";
String serie = "";
Scanner sc = new Scanner(System.in); int opcaoPlano;
int resp2;
int opcaoPg;
double preco = 0;

do {

System.out.println("=== MENU ===");
System.out.println("1 - Lista de séries cadastradas");
System.out.println("2 - Mostrar filmes de terror");
System.out.println("3 - Mostrar filmes de suspense");
System.out.println("4 - Mostrar filmes de ficção científica");
System.out.println("5 - Mostrar todos os filmes cadastrados");
System.out.println("6 - Cadastrar um novo filme");
System.out.println("7 - Cadastrar uma nova série");
System.out.println("8 - Escolher o plano");
System.out.println("9 - Encerrar Programa");
System.out.println("Digite a opção desejada");

opc = sc.nextInt();

if(opc==1){
System.out.println("=== Lista de séries cadastradas ===");

System.out.println("Teen Wolf");
System.out.println("You");
System.out.println("Brooklyn Nine-Nine");
System.out.println("La Casa de Papel");
System.out.println("Stranger Things");

continuar=false;

System.out.println("Voltar ao Menu");
System.out.println("Digite 1 para SIM e 2 para NÃO");
resp=sc.nextInt();
if(resp==1)
continuar=true;
if (resp==2)
continuar=false;}

if(opc==2){

System.out.println("=== Filmes de terror ===");
System.out.println("Pearl");
System.out.println("It A Coisa");
System.out.println("Corra!");
for (int i = 0; i <= 2; i++) {
titulo = titulos.get(i);
genero = generos.get(i);
if (genero.equalsIgnoreCase("Terror")) {
System.out.println(titulo + " - " + genero);



System.out.println("Voltar ao Menu");
System.out.println("Digite 1 para SIM e 2 para NÃO");
resp=sc.nextInt();
if(resp==1)
continuar=true;
if (resp==2)
continuar=false;}
}
}
if(opc==3){

System.out.println("=== Filmes de suspense ===");

System.out.println("Pânico 1");
System.out.println("Sorria");
System.out.println("Parasita");

for (int i = 0; i <= 4; i++) {
titulo = titulos.get(i);

genero = generos.get(i);

if (genero.equalsIgnoreCase("Suspense")) {

System.out.println(titulo + " - " + genero);

break;}

}

continuar=true;

System.out.println("Voltar ao Menu");

System.out.println("Digite 1 para SIM e 2 para NÃO");

 resp=sc.nextInt();

 if(resp==1)

 continuar=true;

if (resp==2)

 continuar=false;}
 if(opc==4){

 System.out.println("=== Filmes de ficção científica ===");
 System.out.println("Avatar");

 System.out.println("Perdido em Marte");

 System.out.println("A quinta onda");

 System.out.println("Maze Runner");

for (int i = 0; i <=2; i++) {

 titulo = titulos.get(i);
genero = generos.get(i);

 if (genero.equalsIgnoreCase(

 "Ficção Científica")) {

System.out.println(titulo + " - " + genero);}

 System.out.println("Voltar ao Menu");

 System.out.println("Digite 1 para SIM e 2 para NÃO");

resp=sc.nextInt();

if(resp==1)

 continuar=true;
 

 if (resp==2)

 continuar=false;

 }

}





 if(opc==5){

 System.out.println("=== Todos os filmes cadastrados ===");

 System.out.println("Pearl");

 System.out.println("It A Coisa");

 System.out.println("Corra!");

 System.out.println("Avatar");
 System.out.println("Perdido em Marte");

System.out.println("A quinta onda");

 System.out.println("Maze Runner");
   System.out.println("Pânico 1");

System.out.println("Sorria");

 System.out.println("Parasita");

 for (int i = 0; i < titulos.size(); i++) {
System.out.println(titulos.get(i) + " - " + generos.get(i));


break;}}

if(opc==6){

System.out.println("=== Cadastro de novo filme ===");

 for (int i = 0; i <= 5; i++) {

 System.out.print("Digite o título do filme: ");

sc.nextLine();

titulo = sc.nextLine();

 System.out.print("Digite o gênero do filme (Suspense, Terror ou Ficção Científica): ");

genero = sc.nextLine();

 titulos.add(titulo);

 generos.add(genero);

 System.out.println("Filme cadastrado com sucesso!");
break;

 }

continuar=false;

System.out.println("Voltar ao Menu");

 System.out.println("Digite 1 para SIM e 2 para NÃO");
 resp=sc.nextInt();
 if(resp==1)
 continuar=true;
 if (resp==2)

 continuar=false;}

 if(opc==7){
 System.out.println("=== Cadastro de nova série ===");

 System.out.print("Digite o nome da série: ");
 sc.nextLine(); 

 serie = sc.nextLine();

 System.out.println("Série cadastrada com sucesso!");
 System.out.println("Voltar ao Menu");

 System.out.println("Digite 1 para SIM e 2 para NÃO");
resp=sc.nextInt();

if(resp==1)

 continuar=true;

 if (resp==2)

 continuar=false;

 break;}

 if(opc==8) 
 System.out.println("Voltar ao Menu");

 System.out.println("Digite 1 para SIM e 2 para NÃO");
resp=sc.nextInt();
 
System.out.println("***** PLANOS *****\n");
System.out.println("¨¨ Escolha o plano desejado: ¨¨  \n");
System.out.println("1- Plano Basic (R$12,00) \n");
System.out.println("2- Plano Duo (R$20,00) \n");
System.out.println("3- Plano Silver (R$26,00) \n");
System.out.println("4- Plano Premium (R$43,00) \n");

System.out.println("Digite a opção desejada: ");
opcaoPlano = sc.nextInt();

if(opcaoPlano==1){
    System.out.println("Você escolheu o Plano Basic (R$12,00). \n");
    continuar=false;
    preco = 12.00;
        System.out.println("Deseja ir para o pagamento?");
        System.out.println("Digite 1 para SIM e 2 para NÃO.");
        resp2= sc.nextInt(); 
        if(resp2==1){
        continuar=true;
    }if(resp2==2){
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
    resp2= sc.nextInt(); 
    if(resp2==2){
        continuar=true;
    }if(resp2==2){
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
    resp2= sc.nextInt(); 
    if(resp2==1){
        continuar=true;
    }if(resp2==2){
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
    resp2= sc.nextInt(); 
    if(resp2==1){
        continuar=true;
    }if(resp2==2){
            continuar=false;
    }
}

    System.out.println("***** PAGAMENTO *****\n");
    System.out.println("¨¨ Escolha a forma de pagamento desejada: ¨¨  \n");
    System.out.println("1- PIX. \n");
    System.out.println("2- Transferência Bancária. \n");
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
    double valorFinal = preco; 
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
    };



if(opc==9){

System.out.println("=== PROGRAMA ENCERRADO ===");

}
 }
  while (continuar);



sc.close();



}
}
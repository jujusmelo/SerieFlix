import java.util.ArrayList;
import java.util.Scanner;

public class projeto {
    public static void main(String[] args) {
        ArrayList<String> titulos = new ArrayList<>();
        ArrayList<String> generos = new ArrayList<>();
        boolean continuar = true;
        int opc;
        int resp;
        String genero = "";
        String titulo = "";
        String serie = "";
        
        Scanner sc = new Scanner(System.in);
        
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
                        }
                    }
                        continuar=false;
                    System.out.println("Voltar ao Menu");
                    System.out.println("Digite 1 para SIM e 2 para NÃO");
                    resp=sc.nextInt();
                    if(resp==1)
                        continuar=true;
                        if (resp==2)
                            continuar=false;}
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
                    sc.nextLine(); // Limpar o buffer do teclado
                    serie = sc.nextLine();
                    System.out.println("Série cadastrada com sucesso!");
                    break;}
                    if(opc==8){
                    System.out.println("=== Escolher Plano ===");
                    break;}
                    if(opc==9){
                    System.out.println("=== PROGRAMA ENCERRADO ===");
                    continuar = false;}
                   
                    
            
        
            
        } while (continuar);
        
        sc.close();
    }
}

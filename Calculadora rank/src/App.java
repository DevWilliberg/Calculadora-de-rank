import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
       String nome;
       int vitoria;
       int derrota;




        Scanner sc = new Scanner(System.in);
        System.out.println("digite o nome do Héroi:");
        nome = sc.next();
        System.out.println("informe quantas vitórias seu Héroi possui?");
        vitoria = sc.nextInt();
        System.out.println("informe quantas derrotas seu Héroi possui?");
        derrota = sc.nextInt();

        sc.close();

        CalculadoraRank calculadoraRank = new CalculadoraRank(nome, vitoria, derrota);
        
        
        int saldoVitoria = calculadoraRank.calcularRank(vitoria, derrota);
        String nivelJogador = calculadoraRank.classificacao(saldoVitoria);

        System.out.println("O Héroi "+ nome + " tem de saldo de vitórias " + saldoVitoria + " está no nível " + nivelJogador);

       
    
    }
}

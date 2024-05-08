import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        System.out.println("\n*****************\n");
        //os argumentos começam com indice 0
        String nomex = args [0];
        String sobrenomex = args [1];
        int idadex = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double alturax = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nomex + " " + sobrenomex);
        System.out.println("Tenho " + idadex + " anos ");
        System.out.println("Minha altura é " + alturax + "cm ");

        System.out.println("\n\n*****************\n");

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("\nOla, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        System.out.println("\n\n*****************\n");
    }

    

}

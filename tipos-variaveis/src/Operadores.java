public class Operadores {
    public static void main(String[] args) {

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.print(nomeCompleto);
        System.out.println("\n");

        String concatenacao ="?"; 
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        
        System.out.println("\n");

        int numero = 5; 
        numero = - numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);


    }
}

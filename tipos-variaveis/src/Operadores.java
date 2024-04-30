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

        numero = numero + 1;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        System.out.println(numero ++); //incrementa depois de imprimir
        System.out.println(numero);
        System.out.println( ++ numero); // incrementa antes

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        System.out.println("\n");

        int a, b;

        a = 5;
        b = 6;

        String resultado = "";
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";

        System.out.println(resultado);
        
        String valor = (a==b) ? "verdadeiro" : "falso";

        System.out.println(valor);

    }
}

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
        
        System.out.println("\n\n*****************\n");

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

        System.out.println("\n\n*****************\n");

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

        System.out.println("\n\n*****************\n");

        String nomeUm = "GLEYSON";
        String nomeDois = new String("GLEYSON");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        if(numero1 == numero2){
            System.out.println("a nossa condição é verdadeira.");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        boolean simNao2 = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao2);

        boolean simNao3 = numero1 > numero2;

        System.out.println("numeroUm é maior a numeroDois? " + simNao3);

        System.out.println("\n\n*****************\n");

        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");;

        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");

        System.out.println("\n\n*****************\n");

    }
}

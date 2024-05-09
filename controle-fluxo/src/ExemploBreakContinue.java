public class ExemploBreakContinue {
    public static void main(String[] args) {
        
	
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            
            System.out.println(numero);
            
        }


	
        for(int numero2 = 1; numero2 <=5; numero2 ++){
            if(numero2==3)
                continue;
            
            System.out.println(numero2);
        }


    }
}

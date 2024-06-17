package automoveis;
public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("954846");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("654189");

        Veiculo coringa = jeep;

        coringa.ligar();
    }

}

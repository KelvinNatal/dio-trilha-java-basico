public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        int numero = 10;
        int numero2 = -25;
        
        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        if (numero < 0 || numero2 < 0)
            System.out.println("Número negativo");
        else
            System.out.println("Número Positivo");
    }
}   

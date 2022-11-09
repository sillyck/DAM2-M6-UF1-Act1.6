/*
 * És vol saber si un numero es primo o no.
 */
public class Primo {
    public static void main(String[] args) {
        esPrimo(4);
    }

    public static void esPrimo(int numeroEntrat){

        if(numeroEntrat == 0 || numeroEntrat == 1 || numeroEntrat == 4){
            System.out.println("No es primo");
        }

        for (int x = 2; x < numeroEntrat / 2; x++) {
            if (numeroEntrat % x == 0)
                System.out.println("No es primo");
        }
        System.out.println("Es primo");
    }
}


/*
 * És vol saber si un numero es primo o no.
 */
public class Primo {
    public static void main(String[] args) {
        if(Primo(4)) {
            System.out.println("Primo");
        }else {
            System.out.println("No es primo");
        }

    }

    public static boolean Primo(int numeroEntrat){

        if(numeroEntrat == 0 || numeroEntrat == 1 || numeroEntrat == 4){
            return false;
        }

        for (int x = 2; x < numeroEntrat / 2; x++) {
            if (numeroEntrat % x == 0)
                return false;
        }
        return true;
    }
}


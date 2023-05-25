package excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lopes
 */
public class TesteExcecao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        try {
            int x = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("O valor digitado não é um inteiro");
        }

        System.out.println("Digite outro numero inteiro: ");
        /*
        int y = entrada.nextInt();
        try {
            System.out.println(x + " / " + y + " = " + (x/y));
        } catch (RuntimeException e) {
            System.out.println("Erro: \nDivisão por zero.");
            e.printStackTrace();
        }
                
        System.out.println(x + " * " + y + " = " + (x*y));
        System.out.println(x + " - " + y + " = " + (x-y));
        System.out.println(x + " + " + y + " = " + (x+y));
    }*/
    }
}

/*
Declare um vetor de quatro posições do tipo de dados inteiro, o software deve
permanecer pedindo para o usuário digitar um valor, até que o mesmo digite
quatro valores válidos, os valores válidos devem ser armazenados no vetor.
*/
import java.util.Scanner;

public class Mod2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int nums[] = new int[4];
        boolean ok;
        for (int i = 0; i < 4; i++) {
            ok = false;
            do {
                try {
                    System.out.printf("\nDigite o %dº número inteiro: ", i+1);
                    nums[i] = read.nextInt();
                    ok = true;
                } catch (Exception e) {
                    System.out.println("\nValor inválido, tente novamente.");
                    read.next();
                }
            } while (!ok);
        }
        read.close();
    }    
}
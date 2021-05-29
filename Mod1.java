/*
Faça um programa que leia quatro valores. Faça a divisão do primeiro valor
pelo segundo. Na sequência, subtraia o resultado pelo terceiro valor informado.
Após, multiplique o resultado obtido pelo quarto valor informado pelo usuário.
Realize tratamento de exceção para caso um dos valores digitados seja inválido
*/

import java.util.Scanner;

public class Mod1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int nums[] = new int[4];
        boolean ok = false;
        float result;
        for (int i = 0; i < 4; i++){
            ok = false;
            System.out.printf("\nDigite o %dº valor inteiro: ", (i+1));
            try {
                do {
                    nums[i] = read.nextInt();
                    ok = true;
                } while (!ok);
            } catch (Exception e) {
                System.out.printf("Valor inválido, tente informar o %dº número novamente", (i+1));
            }
        }
        read.close();
        try {
            result = (nums[0] / nums[1]);
            result -= nums[2];
            result *= nums[3];
            System.out.printf("Resultado: %f", result);
        } catch (Exception e) {
            System.out.printf("Um erro inesperado ocorreu durante o processamento: %s", e.getMessage());
        }
    }
}
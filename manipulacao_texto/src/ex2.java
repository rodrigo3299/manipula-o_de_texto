/*programa em java para ler uma frase e imprimir a qntd de vogais
presentes na frase
 */

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int totalDevogais = 0;
        char[] letra;
        char aux;

        System.out.print("Frase -->");
        frase = sc.nextLine();

        letra = frase.toCharArray();


        for (int i = 0; i < letra.length; i++) {
            System.out.print(letra[i] + "\t");
        }

        // percorrendo a string caracter por caracter dentro da propria string
        System.out.println();
        for (int i = 0; i < frase.length(); i++) {
            System.out.print(frase.charAt(i) + "\t");
        }

        //contando o numero de vogais
        System.out.println();
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            aux = frase.charAt(i);
            switch(aux){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    totalDevogais++;
            }
        }
        System.out.println("Total de vogais = " + totalDevogais );
    }
}

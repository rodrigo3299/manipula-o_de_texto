import java.util.Scanner;

public class ex_maniText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra,frase;
        int idade;

        System.out.println("Palavra -->");
        palavra = sc.next();
        System.out.println("Idade -->");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Frase -->");
        frase = sc.nextLine();

        System.out.println(frase);
        System.out.println(palavra);
        System.out.println(idade);
    }
}

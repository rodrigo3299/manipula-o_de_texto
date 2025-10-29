import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String texto, textoCripto;
        int deslocamento;

        System.out.print("Texto : ");
        texto = sc.nextLine();
        System.out.print("Deslocamento ");
        deslocamento = sc.nextInt();

        textoCripto = criptografar(texto, deslocamento);
        System.out.println(textoCripto);

    }

    public static String criptografar(String text, int deslo) {
        String aux = "";
        char ch;
        int valor;
        int desloc = deslo % 26;
        int base;

        for (int i = 0; i < text.length(); i++) {
            ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                base = ch - 'a';
                aux += (char)('a' + (base + desloc) % 26);
            }
            else if (ch >= 'A' && ch <= 'Z') {

            }
            else {
                aux += ch;
            }
        }
        return aux;
    }



}

import java.util.Scanner;

public class Cripto {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Scanner v = new Scanner(System.in);
        Scanner r = new Scanner(System.in);
        char ascii;
        char x, y;

        System.out.print("Digite a mensagem: ");
        String mens = t.nextLine();
        System.out.print("Digite a CHAVE: ");
        int chave = v.nextInt();

        while (chave >= 26) { chave = chave - 26; }

        System.out.println("1 - Descriptografar mensagem");
        System.out.println("2 - Criptografar mensagem");
        System.out.print("Voce quer: ");
        int z = Integer.parseInt(r.nextLine());

        if (z == 2) {

            for (int i = 0; i < mens.length(); i++) {
                if (mens.charAt(i) == 32){
                    System.out.print(" ");}

                if (mens.charAt(i) >= 97 && mens.charAt(i) <= 122) {                          //Letras minusculas Cripto
                    if ((int) (mens.charAt(i) + chave) > 122) {
                        x = (char) (mens.charAt(i) + chave);
                        y = (char) (x - 122);
                        ascii = (char) (96 + y);
                        System.out.print(ascii);
                    } else {
                        ascii = (char) (mens.charAt(i) + chave);
                        System.out.print(ascii);
                    }
                }

                if (mens.charAt(i) >= 65 && mens.charAt(i) <= 90) {                           //Letras maiusculas Cripto
                    if (mens.charAt(i) + chave > 90) {
                        x = (char) (mens.charAt(i) + chave);
                        y = (char) (x - 90);
                        ascii = (char) (64 + y);
                        System.out.print(ascii);
                    } else {
                        ascii = (char) (mens.charAt(i) + chave);
                        System.out.print(ascii);
                    }
                }
            }

        } else if (z == 1) {
            for (int i = 0; i < mens.length(); i++) {
                if (mens.charAt(i) == 32){
                    System.out.print(" ");}

                if (mens.charAt(i) >= 97 && mens.charAt(i) <= 122) {                       //Letras minusculas Descripto
                    x = (char) (mens.charAt(i) - chave);

                    if (x < 97) {
                        x = (char) (x + 26);}
                    System.out.print(x);}

                if (mens.charAt(i) >= 65 && mens.charAt(i) <= 90) {                        //Letras maiusculas Descripto
                    x = (char) (mens.charAt(i) - chave);

                    if (x < 65) {
                        x = (char) (x + 26);}
                    System.out.print(x);
                }
            }

        } else {
            System.out.print("Nenhuma instrucao valida definida.");
        }
    }
}
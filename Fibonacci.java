public class Fibonacci {
    public static void main(String[] args) {
        int before = 1;
        int atual = 1;
        int other;
        System.out.print("1 ");
        for (int i = 1; i < 15; i++ ) {   //O limite do For é a quantidade de numeros que vai ser mostrado
            System.out.print(atual + " ");
            other = atual;
            atual = atual + before;
            before = other;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 1.50);
        Produto p2 = p1;
        p2.setPreco(2.00);
        System.out.println(p1.getPreco());

        /* O número imprimido será 2.0 porque na linha 5, o objeto p2 foi referenciado como p1 e logo foi usado o
        setPreco para usar um outro valor como parâmetro (no caso, é o valor 2.00). Se não fosse por isso, o valor
        imprimido seria 1.5
         */
    }
}
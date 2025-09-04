import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println();

        var pessoa1 = new Pessoa();
        pessoa1.setNome("Moze");
        pessoa1.setIdade(18);
        pessoa1.exibirStatus();

        System.out.println();

        var pessoa2 = new Pessoa();
        pessoa2.setNome("Myrk");
        pessoa2.setIdade(6000);
        pessoa2.exibirStatus();

        System.out.println();
        
        var pessoa3 = new Pessoa();
        pessoa3.setNome("Themis");
        pessoa3.setIdade(700);
        pessoa3.exibirStatus();

        System.out.println();

        var pessoa4 = new Pessoa();
        pessoa4.setNome("Lu Younling");
        pessoa4.setIdade(999);
        pessoa4.exibirStatus();

        System.out.println();

        var pessoa5 = new Pessoa();
        pessoa5.setNome("Angel Fiori");
        pessoa5.setIdade(25);
        pessoa5.exibirStatus();

        //Desafio 2

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        //Desafio 3

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        listaDePessoas.add(pessoa4);
        listaDePessoas.add(pessoa5);

        System.out.println();

        //Desafio 4

        System.out.println("Tamanho da Lista: " + listaDePessoas.size());

        System.out.println();

        //Desafio 5

        System.out.println("Primeira pessoa: " + listaDePessoas.get(0).getNome());

        System.out.println();


        // Desafio 6
        
        System.out.println(listaDePessoas);
    }
}

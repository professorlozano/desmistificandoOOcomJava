
import java.util.ArrayList;
import java.util.Scanner;

public class UsaPessoa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        
        char controle = 's';
        do {
            System.out.println("Digite o nome: ");
            String n = leia.next();
            System.out.println("Digite a idade: ");
            int i = leia.nextInt();
            Pessoa p = new Pessoa(n,i);
            lista.add(p);
            System.out.println("Deseja cadastrar outra pessoa? s ou S para sim.");
            controle = leia.next().charAt(0);
        }while(controle == 's' || controle == 'S');
        
        for (Pessoa i: lista){
            System.out.println(i);
        }
        
        String nome = lista.get(0).getNome();
        int idade = lista.get(0).getIdade();
        
        System.out.println("Nome: "+nome+" idade: "+idade);
    }
}

package cadastro_base.ui;

import java.util.Scanner;

import cadastro_base.data.Cadastro;
import cadastro_base.domain.Pessoa;

public class PaginaInicial {

    public void  iniciarCadastro() {
   
        Pessoa novaPessoa = new Pessoa();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva seu nome: "); 
        String nome = scanner.nextLine();
        novaPessoa.setNome(nome);
        Cadastro cadastro = new Cadastro(novaPessoa);
        cadastro.salvar();

        // salvarCadastro.salvarCadastro(novaPessoa);
        // System.out.println("Nome: " + novaPessoa.getNome());
    


        
       
    } 
    
    
   

  

}

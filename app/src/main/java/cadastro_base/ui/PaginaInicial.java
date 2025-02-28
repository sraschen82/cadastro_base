package cadastro_base.ui;

import java.util.Scanner;

import cadastro_base.data.CadastroInterface;
import cadastro_base.data.CadastroTxtImpl;
import cadastro_base.domain.Pessoa;

public class PaginaInicial {

    public void  iniciarCadastro() {
   
        Pessoa novaPessoa = new Pessoa();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva seu nome: "); 
        String nome = scanner.nextLine();
        novaPessoa.setNome(nome);
        CadastroInterface cadastro = new CadastroTxtImpl(novaPessoa);
        cadastro.salvar();
        iniciarCadastro();

        // salvarCadastro.salvarCadastro(novaPessoa);
        // System.out.println("Nome: " + novaPessoa.getNome());
    


        
       
    } 
    
    
   

  

}

package cadastro_base.ui;

import java.util.ArrayList;
import java.util.Scanner;

import cadastro_base.data.CadastroInterface;
import cadastro_base.data.CadastroTxtImpl;
import cadastro_base.domain.Pessoa;

public class PaginaInicial {

    public void  iniciarCadastro() {

       
        ArrayList<Pessoa> pessoas = new CadastroTxtImpl().lerArquivo();
        System.out.print("\nCadastros:\n"); 
        int i = 1;
        for (Pessoa pessoa : pessoas) {
            System.out.println(i+". "+pessoa.toString());
            i++;
        }
   
        Pessoa novaPessoa = new Pessoa();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nCadastre outra pessoa: "); 
        String nome = scanner.nextLine();
        novaPessoa.setNome(nome);
        CadastroInterface cadastro = new CadastroTxtImpl();
        cadastro.salvar(novaPessoa);
        iniciarCadastro();

             
       
    } 
    
   }

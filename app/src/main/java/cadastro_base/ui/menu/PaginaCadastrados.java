package cadastro_base.ui.menu;

import java.util.ArrayList;

import cadastro_base.domain.ControleCadastro;
import cadastro_base.domain.Pessoa;

public  class PaginaCadastrados {
   
    public static void listar() {
        ControleCadastro cadastro = new ControleCadastro();
        ArrayList<Pessoa> lista = cadastro.carregarLista();
       
        System.out.print("\nCadastros:\n"); 
        int i = 1;
        for (Pessoa pessoa : lista) {
             System.out.println(i+". "+pessoa.toString());
             i++;
    }

    }
}

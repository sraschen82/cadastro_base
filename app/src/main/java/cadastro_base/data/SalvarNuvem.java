package cadastro_base.data;

import java.util.ArrayList;

import cadastro_base.domain.Pessoa;

public class SalvarNuvem implements CadastroInterface {
    @Override
    public void salvar(Pessoa pessoa) {
        System.out.println("Salvando na nuvem");
    }

   

    @Override
    public ArrayList<Pessoa> lerArquivo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lerArquivo'");
    }



    @Override
    public void editar(Pessoa pessoa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editar'");
    }



    @Override
    public void excluir(Pessoa pessoa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }   
    
}

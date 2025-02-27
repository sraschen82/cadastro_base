package cadastro_base.data;

import cadastro_base.domain.Pessoa;

public class Cadastro implements CadastroInterface {
    Pessoa pessoa = new Pessoa();


    public Cadastro(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
   
    @Override
    public void salvar() {
        
        System.out.println("Nome: " + pessoa.getNome());
    }


    @Override
    public void listar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }
    
}

package cadastro_base.data;

import java.util.ArrayList;

import cadastro_base.domain.Pessoa;

public interface CadastroInterface {
    public ArrayList<Pessoa> lerArquivo();
    public void salvar(Pessoa pessoa);
    public void editar(Pessoa pessoa);
    public void excluir(Pessoa pessoa);
    
}

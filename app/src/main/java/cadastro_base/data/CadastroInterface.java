package cadastro_base.data;

import java.util.ArrayList;

import cadastro_base.domain.Pessoa;

public interface CadastroInterface  {
    public ArrayList<Pessoa> lerArquivo();
    public void salvar(Pessoa pessoa);
    public void salvarLista(ArrayList<Pessoa> lista);
    public void editar(int index, Pessoa pessoa);
    public void excluir(int indice);
    
}

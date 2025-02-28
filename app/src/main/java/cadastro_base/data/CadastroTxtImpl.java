package cadastro_base.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import cadastro_base.domain.Pessoa;

public class CadastroTxtImpl implements CadastroInterface {
   
    private String nomeArquivo = "cadastro.txt";
   
    public CadastroTxtImpl() {
       
    }

    @Override
    public ArrayList<Pessoa> lerArquivo() {
        ArrayList<Pessoa> linhas = new ArrayList<>();
        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader entrada = new BufferedReader(arquivo);
            String linha;
            while((linha = entrada.readLine()) != null) {
                linhas.add(new Pessoa(linha));
            }
            arquivo.close();
            entrada.close();
            System.out.println("Arquivo lido com sucesso!");
           
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo");
        }
       
        return linhas;
    }
    
   
    @Override
    public void salvar(Pessoa pessoa) {
       
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo, true);
            BufferedWriter saida = new BufferedWriter(arquivo);
            saida.write(pessoa.toString());
            saida.newLine();
            saida.close();
            System.out.println("Cadastro salvo com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao salvar arquivo");
        }

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

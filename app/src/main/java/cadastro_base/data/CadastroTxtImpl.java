package cadastro_base.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import cadastro_base.domain.Pessoa;

public class CadastroTxtImpl implements CadastroInterface {
    private Pessoa pessoa = new Pessoa();
    private String nomeArquivo = "cadastro.txt";
   
    public CadastroTxtImpl(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public ArrayList<String> lerArquivo() {
        ArrayList<String> linhas = new ArrayList<>();
        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader entrada = new BufferedReader(arquivo);
            String linha;
            while((linha = entrada.readLine()) != null) {
                linhas.add(linha);
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
    public void salvar() {
       
        try {
            ArrayList<String> linhas = lerArquivo();

            FileWriter arquivo = new FileWriter(nomeArquivo);
            BufferedWriter saida = new BufferedWriter(arquivo);
           
            linhas.add(pessoa.toString());
          
            for (String linha : linhas) {
                saida.write(linha);
               
                saida.newLine();
            }
           
          
            saida.close();
            System.out.println("Cadastro salvo com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao salvar arquivo");
        }

    }


    
}

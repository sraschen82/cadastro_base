package cadastro_base.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import cadastro_base.domain.Pessoa;

public class CadastroTxtImpl implements CadastroInterface {
   
    private String nomeArquivo = "cadastro.txt";
   
    @Override
    public ArrayList<Pessoa> lerArquivo() {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader entrada = new BufferedReader(arquivo);
            String linha;
            while((linha = entrada.readLine()) != null) {
                String[] div = linha.split("; ");
                if (div.length == 3) { // Verifica se a linha tem 3 campos
                    pessoas.add(new Pessoa(div[0], div[1], div[2])); 
                } else {
                    System.out.println("Linha mal formatada: " + linha); // Caso haja algo errado na linha
                }
            }
            arquivo.close();
            entrada.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo");
            e.printStackTrace();
        }
       
        return pessoas;
    }
    
   
    @Override
    public void salvar(Pessoa pessoa) {
       
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo, true);
            BufferedWriter saida = new BufferedWriter(arquivo);
            saida.write(pessoa.toString());
            saida.newLine();
            saida.close();
            
        } catch (Exception e) {
            System.out.println("Erro ao salvar arquivo");
        }

    }

    @Override
    public void salvarLista(ArrayList<Pessoa> lista) {
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo);
            BufferedWriter saida = new BufferedWriter(arquivo);
            for (Pessoa pessoa : lista) {
                saida.write(pessoa.toString());
                saida.newLine();
            }
            saida.close();
           
        } catch (Exception e) {
            System.out.println("Erro ao salvar a lista.");
        }
       
    }

   
    @Override
    public void editar(int index,Pessoa pessoa) {
        ArrayList<Pessoa> lista = lerArquivo();
        lista.remove(index);
        lista.add(index, pessoa);
        salvarLista(lista);
            
      
    }

    @Override
    public void excluir(int indice) {
        ArrayList<Pessoa> lista = lerArquivo();
        lista.remove(indice);
        salvarLista(lista);
    }

}

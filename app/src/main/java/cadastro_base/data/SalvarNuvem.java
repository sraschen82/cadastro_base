package cadastro_base.data;

import java.util.ArrayList;

public class SalvarNuvem implements CadastroInterface {
    @Override
    public void salvar() {
        System.out.println("Salvando na nuvem");
    }

   

    @Override
    public ArrayList<String> lerArquivo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lerArquivo'");
    }   
    
}

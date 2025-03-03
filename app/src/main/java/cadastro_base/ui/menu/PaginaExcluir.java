package cadastro_base.ui.menu;

import java.util.Scanner;

import cadastro_base.domain.ControleCadastro;

public class PaginaExcluir {
    public static void excluirPessoa(Scanner scanner) {
        ControleCadastro cadastro = new ControleCadastro();
        System.out.print("\nDigite o número para excluir a pessoa: ");

        try{
            int index = scanner.nextInt();
            scanner.nextLine();
            if(index < 1 || index > cadastro.carregarLista().size()){
                System.out.println("Número inválido.");
                return;
            }
            cadastro.excluir(index - 1);
        }catch (Exception e){
            System.out.println("Opção inválida, tente novamente.");
        }
        
    }
}

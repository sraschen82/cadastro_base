package cadastro_base.ui.menu;

import java.util.Scanner;
import cadastro_base.domain.ControleCadastro;

public class PaginaCadastrar {

    public static void adicionarPessoa(Scanner scanner) {
        ControleCadastro cadastro = new ControleCadastro();
        System.out.print("\nCadastre uma pessoa: ");
        String nome = scanner.nextLine();
        cadastro.salvar(nome);
    }
}

package cadastro_base.ui.menu;

import java.util.Scanner;

import cadastro_base.domain.ControleCadastro;

public class PaginaCadastrar {

    public static void adicionarPessoa(Scanner scanner) {
        ControleCadastro cadastro = new ControleCadastro();
        System.out.print("\nCadastre uma pessoa. Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();

        cadastro.salvar(nome, cpf, cep);
    }
}

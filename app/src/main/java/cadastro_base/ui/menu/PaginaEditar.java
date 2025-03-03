package cadastro_base.ui.menu;

import java.util.Scanner;

import cadastro_base.domain.ControleCadastro;

public class PaginaEditar {

    public static void editarPessoa(Scanner scanner) {
        ControleCadastro cadastro = new ControleCadastro();
        System.out.print("\nDigite o número para editar a pessoa: ");

        try {
            int index = scanner.nextInt();
            scanner.nextLine();
            if (index > 0 && index <= cadastro.carregarLista().size()) {
                System.out.println("\nNome atual: " + cadastro.carregarLista().get(index - 1).getNome());
                System.out.print("Novo nome: ");
                String nomeEditado = scanner.nextLine();
                cadastro.editar(index - 1, nomeEditado);
            } else {
                System.out.println("\nOpção inválida, tente novamente");
            }

        } catch (Exception e) {
            System.out.println("\nOpção inválida, tente novamente");
        }

    }
}

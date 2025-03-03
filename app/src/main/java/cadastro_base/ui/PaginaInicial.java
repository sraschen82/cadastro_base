package cadastro_base.ui;

import java.util.Scanner;
import cadastro_base.ui.menu.PaginaCadastrados;
import cadastro_base.ui.menu.PaginaCadastrar;
import cadastro_base.ui.menu.PaginaEditar;
import cadastro_base.ui.menu.PaginaExcluir;

public class PaginaInicial {

    public void mostrarMenu() {

        System.out.println("""

                ----------------
                    MENU
                1. Listar Cadastrados
                2. Cadastrar
                3. Editar
                4. Excluir
                5. Sair
                ----------------
                """);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número da opção desejada: ");
        try {
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    PaginaCadastrados.listar();
                    break;
                case 2:
                    PaginaCadastrar.adicionarPessoa(scanner);
                    PaginaCadastrados.listar();
                    break;
                case 3:
                    PaginaCadastrados.listar();
                    PaginaEditar.editarPessoa(scanner);
                    PaginaCadastrados.listar();
                    break;

                case 4:
                    PaginaCadastrados.listar();
                    PaginaExcluir.excluirPessoa(scanner);
                    PaginaCadastrados.listar();

                    break;

                case 5:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nOpção inválida, tente novamente");
                    break;
            }

        } catch (Exception e) {
            System.out.println("Erro ao ler a opção");
        }

        mostrarMenu();
        scanner.close();

    }

}

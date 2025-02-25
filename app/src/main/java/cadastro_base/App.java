package cadastro_base;

import cadastro_base.ui.PaginaInicial;

public class App {
    public String getGreeting() {
        return "Projeto Cadastro";
    }

    public static void main(String[] args) {

        PaginaInicial paginaInicial = new PaginaInicial();
        System.out.println(paginaInicial.getGreeting());
       
       
    }
}

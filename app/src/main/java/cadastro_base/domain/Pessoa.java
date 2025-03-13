package cadastro_base.domain;

public class Pessoa {

    private String nome;
    private String cpf;
    private String cep;

 public Pessoa() {
    }
    
    public Pessoa(String nome, String cpf, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return this.cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCEP() {
        return this.cep;
    }

    public void setCEP(String cep) {
        this.cep = cep;
    }
    

    @Override
    public String toString() {
        return  getNome() + "; " + getCPF() + "; " + getCEP();
    }

   

}



// package cadastro_base.domain;

// public class Pessoa {
//     private String nome;
//     private String cpf;
//     private String email;
//     private String telefone;
//     private String endereco;

//     public Pessoa(String nome, String cpf, String email, String telefone, String endereco) {
//         this.nome = nome;
//         this.cpf = cpf;
//         this.email = email;
//         this.telefone = telefone;
//         this.endereco = endereco;
//     }

//     public String getNome() {
//         return nome;
//     }

//     public String getCpf() {
//         return cpf;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public String getTelefone() {
//         return telefone;
//     }

//     public String getEndereco() {
//         return endereco;
//     }

//     public void setNome(String nome) {
//         this.nome = nome;
//     }

//     public void setCpf(String cpf) {
//         this.cpf = cpf;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }

//     public void setTelefone(String telefone) {
//         this.telefone = telefone;
//     }

//     public void setEndereco(String endereco) {
//         this.endereco = endereco;
//     }

//     @Override
//     public String toString() {
//         return "{" +
//             " nome='" + getNome() + "'" +
//             ", cpf='" + getCpf() + "'" +
//             ", email='" + getEmail() + "'" +
//             ", telefone='" + getTelefone() + "'" +
//             ", endereco='" + getEndereco() + "'" +
//             "}";
//     }

// }

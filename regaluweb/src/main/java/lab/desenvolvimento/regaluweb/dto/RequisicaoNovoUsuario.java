package lab.desenvolvimento.regaluweb.dto;

import lab.desenvolvimento.regaluweb.models.Usuario;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RequisicaoNovoUsuario {
    @NotBlank
    @NotNull
    private String nome;
    @NotBlank
    private String endereco;
    @NotBlank
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario toUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNome(this.nome);
        usuario.setEndereco(this.endereco);
        usuario.setSenha(this.senha);
        return usuario;
    }

    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}

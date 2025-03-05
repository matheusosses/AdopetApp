package br.com.pets.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class Abrigo {
    @Setter
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private Pet[] pets;

    public Abrigo(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return """
                     "id":%s,"nome":"%s","telefone":"%s","email":"%s"
                     """.formatted(this.id, this.nome, this.telefone, this.email);
    }
}

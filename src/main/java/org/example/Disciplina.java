package org.example;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Disciplina {
    private int Codigo;
    private String Nome;

    public Disciplina(int codigo, String nome) {
        Codigo = codigo;
        Nome = nome;
    }
}

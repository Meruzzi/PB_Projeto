package org.example;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Professor {
    private int Matricula;
    private String Nome;

    public Professor(int matricula, String nome) {
        Matricula = matricula;
        Nome = nome;
    }
}

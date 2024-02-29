package org.example;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno {
    private int Matricula;
    private String Nome;

    public Aluno(int matricula, String nome) {
        Matricula = matricula;
        Nome = nome;
    }



}

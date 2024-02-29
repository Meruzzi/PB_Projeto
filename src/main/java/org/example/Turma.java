package org.example;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Turma {
    private int Codigo;
    private Aluno[] Alunos;
    private Professor Professor;
    private Disciplina Disciplina;

    public Turma(int codigo, org.example.Professor professor, org.example.Disciplina disciplina) {
        Codigo = codigo;
        Alunos = new Aluno[50];
        Professor = professor;
        Disciplina = disciplina;
    }

    public void addAluno(Aluno aluno) {
        int qntAlunos = 0;

        for (int i = 0; i < Alunos.length; i++) {
            if (Alunos[i] != null) {
                qntAlunos++;
                if (qntAlunos >= 50) {
                    System.out.println("Turma cheia.");
                    break;
                }
            } else {
                Alunos[i] = aluno;
                qntAlunos++;
                System.out.println("Aluno adicionado.");
                break;
            }
        }
        System.out.println("Quantidade de alunos cadastrados: " + qntAlunos);
    }

    public boolean abrirTurma() {
        int qntAlunos = 0;
        for (Aluno al : Alunos) {
            if (al != null) {
                qntAlunos++;
            }
        }

        if (qntAlunos >= 10 && qntAlunos <= 50) {
            return true;
        } else return false;
    }

    public void gerarPauta() {
        System.out.println("Código da turma: " + getCodigo());
        System.out.println("Nome da disciplina: " + Disciplina.getNome());
        System.out.println("Nome do professor: " + Professor.getNome());
        System.out.println("Alunos inscritos nessa disciplina:");

        for (Aluno al : Alunos) {
            if (al != null) {
                System.out.println(al.getNome());
            }
        }
    }
}

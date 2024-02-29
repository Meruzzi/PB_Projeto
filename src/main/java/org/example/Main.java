package org.example;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(315135, "Gabriel");
        Professor prof1 = new Professor(46436, "Joao");
        Disciplina disc1 = new Disciplina(001, "Java");

        Turma turma1 = new Turma(42423, prof1, disc1);

        turma1.addAluno(aluno1);
        turma1.addAluno(aluno1);
        turma1.addAluno(aluno1);
        turma1.addAluno(aluno1);
        turma1.addAluno(aluno1);
        turma1.addAluno(aluno1);
        turma1.addAluno(aluno1);
        turma1.addAluno(aluno1);
        turma1.addAluno(aluno1);
        turma1.addAluno(aluno1);

        if(turma1.abrirTurma()) {
            System.out.println("Turma aberta.");
        } else {
            System.out.println("A turma nao atende os requisitos minimos");
        }

        turma1.gerarPauta();


        }
    }
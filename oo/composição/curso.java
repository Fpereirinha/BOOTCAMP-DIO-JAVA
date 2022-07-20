package oo.composição;

import java.util.ArrayList;

public class curso {
    final String nome;
    final ArrayList<aluno> alunos = new ArrayList<>();
    public String toString(){
        return nome;
    }
    curso(String nome){
        this.nome = nome;
    }
    void adicionarAluno(aluno aluno){
        alunos.add(aluno);
        aluno.cursos.add(this);
    }
}

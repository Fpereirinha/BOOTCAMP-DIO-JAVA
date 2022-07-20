package oo.composição;

import java.util.ArrayList;

public class aluno {
    final String nome;
    final ArrayList<curso> cursos = new ArrayList<>();
    public String toString(){
        return nome;
    }
    aluno(String nome){
        this.nome = nome;
    }
    void adicionarCurso(curso curso){
        cursos.add(curso);
        curso.alunos.add(this);
    }
}

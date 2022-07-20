package oo.composição;

public class cursosEAlunosTeste {
    public static void main(String[] args) {
        aluno A1 = new aluno("Pedro");
        aluno A2 = new aluno("João");
        aluno A3 = new aluno("Sara");
        aluno A4 = new aluno("Joaquim");
        curso C1 = new curso("Java");
        curso C2 = new curso("Python");
        curso C3 = new curso("Go Lang");
        curso C4 = new curso("Flutter");
        C1.adicionarAluno(A1);
        C1.adicionarAluno(A2);
        C1.adicionarAluno(A4);
        C2.adicionarAluno(A1);
        C2.adicionarAluno(A3);
        C2.adicionarAluno(A4);
        A2.adicionarCurso(C2);
        for (aluno alu:
             C1.alunos) {
            System.out.printf("Sou o %s e estou matriculado no curso de %s. \n", alu.nome, C1.nome);

        }
        for (curso c:
                A2.cursos) {
            System.out.printf("O aluno %s está matriculado em %s.\n",A2.nome ,c.nome);
        }
        System.out.println(C1.alunos.toString());
        System.out.println(A1.cursos.get(0));
    }
}

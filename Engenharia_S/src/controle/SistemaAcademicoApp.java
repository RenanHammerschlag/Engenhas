package controle;

import java.util.Date;

public class SistemaAcademicoApp {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, "Gabriel de Assis", "Rua A, 123", 21, "(11) 1234-5678");
        Aluno aluno2 = new Aluno(2, "Mariana Silva", "Rua B, 456", 20, "(11) 8765-4321");

        Disciplina disciplina1 = new Disciplina("INF001", "Algoritmos", 4);
        Disciplina disciplina2 = new Disciplina("INF002", "Estruturas de Dados", 5);
        disciplina2.adicionarPreRequisito(disciplina1);

        Professor professor1 = new ProfessorTitular("12345678900", "Dr. João", "Rua C, 789", "(11) 1111-2222", 45, "Computação", "PhD" );
        Professor professor2 = new ProfessorAdjunto("98765432100", "Dra. Ana", "Rua D, 101", "(11) 3333-4444", 40, "Matemática", new Date());

        Turma turma1 = new Turma("TURMA001", "Ativa", professor1);

        Prova prova1 = new Prova("PROV001", new Date(), 2.5, "Em Análise");

        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(disciplina1);
        System.out.println(disciplina2);
        System.out.println(professor1);
        System.out.println(professor2);
        System.out.println(turma1);
        System.out.println(prova1);
    }
}


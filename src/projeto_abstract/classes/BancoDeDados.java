package src.projeto_abstract.classes;

import java.util.ArrayList;

public class BancoDeDados extends Disciplina {
  private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

  @Override
  public void inserir_aluno(Aluno aluno) {
    this.alunos.add(aluno);
    System.out.println("- " + aluno.getName() + " adicionado a turma de Banco de Dados!\n");
  }

  @Override
  public void remover_aluno(int matricula) {
    int findIndex = 0;

    for (int index = 0; index < alunos.size(); index++) {
      int matricula_aluno = alunos.get(index).getMatricula();
      if (matricula_aluno == matricula) {
        findIndex = index;
      }
    }

    if (alunos.get(findIndex) != null) {
      String name_aluno_removido = alunos.get(findIndex).getName();
      System.out.println(name_aluno_removido + " removido da turma de Banco de Dados!");
      alunos.remove(findIndex);
    } else {
      System.out.println("Aluno não encontrado, verifique a matricula!");
    }

  }

  @Override
  public void listar_alunos() {
    if (alunos.size() == 0) {
      System.out.println("Ainda não ha alunos nessa turma!");
    } else {

      for (Aluno aluno : alunos) {
        System.out.println(aluno.getName());
      }
    }
  }

}

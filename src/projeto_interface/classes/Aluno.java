package src.projeto_interface.classes;

public class Aluno {
  private int matricula;
  private String name;

  public Aluno(String name) {
    this.name = name;
    this.matricula = (int)(Math.random() * 9) + 10000 ;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public int getMatricula() {
    return matricula;
  }
}

package src.projeto_abstract;

import src.projeto_abstract.classes.Aluno;
import src.projeto_abstract.classes.BancoDeDados;
import src.projeto_abstract.classes.PadroesDeProjeto;

class Principal {

  public static void main(String[] args) {
    Aluno adriano = new Aluno("Adriano Costa Araujo");
    Aluno paulo = new Aluno("Paulo Cesar Silva");
    Aluno fernando = new Aluno("Fernando Braga Junior");
    Aluno miriam = new Aluno("Miriam Vasconcelos da bezerra");

    BancoDeDados bd = new BancoDeDados();
    PadroesDeProjeto pdp = new PadroesDeProjeto();

    bd.listar_alunos();

    bd.inserir_aluno(adriano);
    bd.inserir_aluno(miriam);
    bd.inserir_aluno(paulo);
    bd.inserir_aluno(fernando);

    bd.listar_alunos();
    
    bd.remover_aluno(miriam.getMatricula());
    bd.remover_aluno(miriam.getMatricula());
    bd.remover_aluno(miriam.getMatricula());
    bd.remover_aluno(fernando.getMatricula());
    
    bd.listar_alunos();
    

    pdp.listar_alunos();

    pdp.inserir_aluno(adriano);
    pdp.inserir_aluno(miriam);
    pdp.inserir_aluno(paulo);
    pdp.inserir_aluno(fernando);

    pdp.listar_alunos();
    
    pdp.remover_aluno(miriam.getMatricula());
    pdp.remover_aluno(miriam.getMatricula());
    pdp.remover_aluno(miriam.getMatricula());
    pdp.remover_aluno(fernando.getMatricula());
    
    pdp.listar_alunos();
  }
}
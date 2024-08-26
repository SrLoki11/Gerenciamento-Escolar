import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String codigo;
    private Disciplina disciplina;
    private List<Aluno> alunos;

    public Turma(String codigo, Disciplina disciplina) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>(); // Inicializa a lista de alunos
    }
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Método para remover um aluno da lista pela matrícula
    public void removerAluno(int matricula) {
        alunos.removeIf(aluno -> aluno.getMatricula() == matricula);
    }

    // Método para buscar um aluno específico pela matrícula
    public Aluno buscarAlunoPorMatricula(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null; // Retorna null se o aluno não for encontrado
    }

    public List<Aluno> listarAlunos() {
        return alunos;
    }

    public String toString() {
        return "Turma: " + codigo + ", Disciplina: " + disciplina.getNome() + ", Total de alunos: " + alunos.size();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

}

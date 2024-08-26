import java.util.List;

public class Escola {

    public static void main(String[] args) {
        // Criação de Disciplinas
        Disciplina matematica = new Disciplina("Matemática", "MATH101");
        Disciplina portugues = new Disciplina("Português", "PORT101");

        // Criação de Turmas
        Turma turmaA = new Turma("Turma A", matematica);
        Turma turmaB = new Turma("Turma B", portugues);

        // Criação de Alunos e Adição às Turmas
        Aluno aluno1 = new Aluno("Cauã", 00001, "Cauanzada@gmail.com");
        Aluno aluno2 = new Aluno("Penumbra", 82000, "Penumbra@gmail.com");
        Aluno aluno3 = new Aluno("TheLittleReaper", 99999, "TheLittleReaper@gmail.com");
        Aluno aluno4 = new Aluno("Calin", 17777, "Carlinhos@gmail.com");
        Aluno aluno5 = new Aluno("GabosGracinhas", 16350, "gabsss@gmail.com");
        Aluno aluno6 = new Aluno("LittleTeteu", 15700, "Teteu@gmail.com");
        Aluno aluno7 = new Aluno("TheNilo", 14141, "Nilão@gmail.com");
        Aluno aluno8 = new Aluno("RivenMain", 77777, "OnlyRiven@gmail.com");
        Aluno aluno9 = new Aluno("Coveiro", 24241, "Coveiros@gmail.com");
        Aluno aluno10 = new Aluno("Rivenzinha", 24241, "Myriven@gmail.com");

        turmaA.adicionarAluno(aluno1);
        turmaA.adicionarAluno(aluno2);
        turmaB.adicionarAluno(aluno3);
        turmaB.adicionarAluno(aluno4);
        turmaA.adicionarAluno(aluno5);
        turmaB.adicionarAluno(aluno6);
        turmaA.adicionarAluno(aluno7);
        turmaB.adicionarAluno(aluno8);
        turmaB.adicionarAluno(aluno9);
        turmaA.adicionarAluno(aluno10);

        // Exibir todos os alunos em uma turma específica
        System.out.println("Alunos na " + turmaA.getCodigo() + ":");
        List<Aluno> alunosTurmaA = turmaA.listarAlunos();
        for (Aluno aluno : alunosTurmaA) {
            System.out.println(aluno);
        }

        // Buscar e exibir um aluno específico pela matrícula
        int matriculaBusca = 82000;
        Aluno alunoEncontrado = turmaA.buscarAlunoPorMatricula(matriculaBusca);
        if (alunoEncontrado != null) {
            System.out.println("\nAluno encontrado: " + alunoEncontrado);
        } else {
            System.out.println("\nAluno com matrícula " + matriculaBusca + " não encontrado.");
        }

        // Atualizar as informações de um aluno
        alunoEncontrado.setNome("TheLittleReaper");
        alunoEncontrado.setEmail("TheLittleReaper@gmail.com");
        System.out.println("\n Informações atualizadas: " + alunoEncontrado);

        // Remover um aluno da turma e exibir a lista atualizada
        turmaA.removerAluno(matriculaBusca);
        System.out.println("\nAlunos restantes na " + turmaA.getCodigo() + " após a remoção:");
        alunosTurmaA = turmaA.listarAlunos();
        for (Aluno aluno : alunosTurmaA) {
            System.out.println(aluno);
        }
    }
}

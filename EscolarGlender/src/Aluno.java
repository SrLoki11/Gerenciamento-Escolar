public class Aluno {
    private String nome;
    private int matricula;
    private String email;

    public Aluno(String nome, int matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
}

public String toString() {
    return "Aluno: " + nome + ", Matrícula: " + matricula + ", Email: " + email;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getMatricula() {
    return matricula;
}

public void setMatricula(int matricula) {
    this.matricula = matricula;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}
}

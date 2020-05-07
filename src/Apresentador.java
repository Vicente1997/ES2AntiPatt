public class Apresentador {
    private String nome;
    private Integer idade;
    private String email;
    private String localTrabalho;



    public Apresentador(String nome, Integer idade, String email, String localTrabalho) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.localTrabalho = localTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }


}

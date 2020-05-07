import java.util.ArrayList;

public class TV {

    private String name;
    private Integer ano_fundacao;
    private String email;
    private String diretorTelevisivo;
    public ArrayList<Apresentador> apresentador = new ArrayList<Apresentador>();

    public TV(String name, Integer ano_fundacao, String email, String diretorTelevisivo) {
        this.name = name;
        this.ano_fundacao = ano_fundacao;
        this.email = email;
        this.diretorTelevisivo = diretorTelevisivo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAno_fundacao() {
        return ano_fundacao;
    }

    public void setAno_fundacao(Integer ano_fundacao) {
        this.ano_fundacao = ano_fundacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiretorTelevisivo() {
        return diretorTelevisivo;
    }

    public void setDiretorTelevisivo(String diretorTelevisivo) {
        this.diretorTelevisivo = diretorTelevisivo;
    }



    public void addApresentador(Apresentador apresentador){
        if(apresentador.getIdade()>=20){
            this.apresentador.add(apresentador);
        }
    }

    public void printApresentador(){
        System.out.println("\nApresentadores:");
        apresentador.forEach(apresentador -> System.out.println(apresentador.getNome()));
    }

}

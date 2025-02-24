import java.util.List;

public abstract class Campanha {
    protected List<String> metricas;
    protected String nome;

    public Campanha (String nome, List<String> metricas){
        this.nome=nome;
        this.metricas=metricas;
    }

    public abstract void configurar();
    public abstract void executar();
    public abstract void avaliar();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<String> getMetricas() {
        return metricas;
    }
    public void setMetricas(List<String> metricas) {
        this.metricas = metricas;
    }

}



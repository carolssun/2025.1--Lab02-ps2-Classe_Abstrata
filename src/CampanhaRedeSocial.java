// Carolina Sun R. N. Castilho - 10386494
import java.util.List;

public class CampanhaRedeSocial extends Campanha {
    public CampanhaRedeSocial(String nome) {
        super(nome, List.of("Curtidas", "Compartilhamentos", "Comentários"));
    }

    @Override
    public void configurar(){
        System.out.println("Configurando a campanha " + nome);
    }

    @Override
    public void executar(){
        System.out.println("Executando a campanha " + nome);
    }

    @Override
    public void avaliar(){
        System.out.println("Avaliando a campanha " + nome + " - métricas - " + metricas);

    }

}

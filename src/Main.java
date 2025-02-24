/**
 * Temos diferentes tipos de campanhas que precisam ser gerenciadas, como campanhas para redes sociais e campanhas de email. Cada tipo de campanha tem suas próprias métricas e formas de execução. Por exemplo, as campanhas de redes sociais
 *têm métricas como curtidas, compartilhamentos e comentários, enquanto as campanhas de e-mail têm métricas como taxa de
 *abertura e taxa de cliques. Precisamos que o sistema nos permita configurar, executar e avaliar essas campanhas, mas sem
 *duplicar código. Queremos um sistema que seja flexível o suficiente para que possamos adicionar novos tipos de campanhas no
 * futuro sem grandes alterações
 */

 /*
  * Carolina Sun R. N. Castilho - 10386494
  */

public class Main {
    public static void main (String [] args){
        Campanha c1 = new CampanhaRedeSocial("Parceria Influencers");
        Campanha c2 = new CampanhaEmail("Notifocações Mensais");

        System.out.println("\n-------------------------------------\n");
        System.out.println("Campanha " + c1.getNome());
        System.out.println();
        c1.configurar();
        c1.executar();
        c1.avaliar();
        System.out.println("\n-------------------------------------\n");
        System.out.println("Campanha " + c2.getNome());
        System.out.println();
        c2.configurar();
        c2.executar();
        c2.avaliar();

       
    }

}
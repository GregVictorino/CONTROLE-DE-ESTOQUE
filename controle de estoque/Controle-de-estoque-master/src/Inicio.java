import java.util.Scanner;

public class Inicio {
    public void comecar() {
        String resposta, tecla = "S";
        Scanner comeco = new Scanner(System.in);
        System.out.println("INSIRA QUALQUER TECLA PARA INICIAR O CONTROLE DE ESTOQUE (S/N)");
        resposta=comeco.next();
        if (resposta.equals(tecla)) {
            Main main = new Main();
            main.controleEstoque();
        } else {
            System.out.println("Até mais");
            Fim fim = new Fim();
            Fim.fim();
        }
        /*POR ALGUM MOTIVO O IF E ELSE ESTÁ FUNCIONANDO AO CONTRÁRIO E EU SÓ
        INVERTI PORQUE ESTAVA DE SACO CHEIO*/
    }
}

import java.util.ArrayList;
import java.util.List;

public class FormaManager {
    private List<Forma> formas;
    private CorFactory corFactory;

    public FormaManager() {
        this.formas = new ArrayList<>();
        this.corFactory = new CorFactory();
    }

    public void addForma(String nomeCor, String posicao, int tamanho) {
        Cor cor = corFactory.getCor(nomeCor);
        formas.add(new Forma(cor, posicao, tamanho));
    }

    public void apresentar() {
        for (Forma forma : formas) {
            System.out.println(forma);
        }
    }
}

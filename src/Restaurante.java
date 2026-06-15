import java.util.ArrayList;
/**
 *
 * @author mirella
 */
public class Restaurante {
    private Gerente gerente;
    private Cozinha cozinha;
    private ArrayList<ItemCardapio> cardapio = new ArrayList<ItemCardapio>();
    private ArrayList<Mesa> mesas = new ArrayList<Mesa>();

    public Restaurante(Gerente gerente, Cozinha cozinha) {
        this.gerente = gerente;
        this.cozinha = cozinha;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Cozinha getCozinha() {
        return cozinha;
    }

    public void setCozinha(Cozinha cozinha) {
        this.cozinha = cozinha;
    }

    public ArrayList<ItemCardapio> getCardapio() {
        return cardapio;
    }

    public void setCardapio(ArrayList<ItemCardapio> cardapio) {
        this.cardapio = cardapio;
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }
    
}

import java.util.ArrayList;

public class Cardapio {
    private ArrayList<ItemComida> listaComidas;
    private ArrayList<ItemBebida> listaBebidas;

    public Cardapio() {
        this.listaComidas = new ArrayList<ItemComida>();
        this.listaBebidas = new ArrayList<ItemBebidas>();
    }

    public ArrayList<ItemComida> getComidas() {
        return listaComidas;
    }

    public ArrayList<ItemBebida> getBebidas() {
        return listaBebidas;
    }

    public void cadastrarItem(ItemComida itemC) {
        this.listaComidas.add(itemC);
    }

    public void cadastrarItem(ItemBebida itemB) {
        this.listaBebidas.add(itemB);
    }

    public void removerItem(ItemComida itemC) {
        this.listaComidas.remove(itemC);
    }

    public void removerItem(ItemBebida itemB) {
        this.listaBebidas.remove(itemB);
    }
}

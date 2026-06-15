import java.util.ArrayList;
/**
 *
 * @author mirella
 */
public class Cozinha {
    private ArrayList<PedidoCliente> listaPedidos = new ArrayList<PedidoCliente> ();

    public Cozinha() {
    }

    public ArrayList getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
    
    public void addPedido(PedidoCliente pedido){
        listaPedidos.add(pedido);
    }
     public ArrayList<PedidoCliente> verPedidosAbertos(){
        return listaPedidos;
     }
     
     public void entregarPedido(PedidoCliente pedido){
         pedido.setStatus("entregue");
         listaPedidos.remove(pedido);
     }
}

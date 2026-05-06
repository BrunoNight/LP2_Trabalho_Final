import java.util.ArrayList;

public class Cozinha
{
    private ArrayList<PedidoCliente> listaPedidos = new ArrayList<PedidoCliente>();
    private int idFila;
    
    public Cozinha()
    {
        this.idFila = 0;
    }

    public ArrayList<PedidoCliente> verPedidosAbertos()
    {
        ArrayList<PedidoCliente> pedidosAbertos = new ArrayList<PedidoCliente>();
    
        for(PedidoCliente pedido: this.listaPedidos){
            if(pedido.getStatusPedido().equalsIgnoreCase("aberto"))
                pedidosAbertos.add(pedido);
        }
        
        return pedidosAbertos;
    }
    
    public void addPedido(PedidoCliente pedido){
        this.listaPedidos.add(pedido);
    }
    
    public void entregarPedido(){
        PedidoCliente atual;
        
        if(idFila < this.listaPedidos.size()){
            atual = this.listaPedidos.get(this.idFila);
            if(atual.getStatusPedido().equalsIgnoreCase("aberto")){
                atual.setStatusPedido("entregue");
                this.idFila++;
            }
        }
    }
    
    public int getIdFila(){
        return this.idFila;
    }
    public void setIdFila(int idFila){
        this.idFila = idFila;
    }
}
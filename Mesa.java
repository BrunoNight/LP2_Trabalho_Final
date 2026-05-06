import java.util.ArrayList;

public class Mesa
{
    private int id;
    private boolean ocupado;
    private Cliente clienteMesa;
    private ArrayList<PedidoCliente> pedidosMesa = new ArrayList<PedidoCliente>();

    public Mesa(int id, Cliente clienteMesa)
    {
        this.id = id;
        this.ocupado = false;
        this.clienteMesa = clienteMesa;
    }

    public void addPedidoMesa(PedidoCliente pedido)
    {
        pedidosMesa.add(pedido);
    }
    public void ocuparMesa(){
        ocupado = true;
    }
    public void liberarMesa(){
        ocupado = false;
    }
    
    public void acessarCardapio(){
        //
    }
    
    public int getId() {
        return id;
    }
    
    public boolean isOcupado() {
        return ocupado;
    }
    
    public Cliente getClienteMesa() {
        return clienteMesa;
    }
    
    public ArrayList<PedidoCliente> getPedidosMesa() {
        return pedidosMesa;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    public void setClienteMesa(Cliente clienteMesa) {
        this.clienteMesa = clienteMesa;
    }
}
import java.util.ArrayList;

public class PedidoCliente {
    private int id;
    private ArrayList<ItemPedido> itensPedido;
    private String statusPedido; // Acho melhor um Enum 
    private float valorTotal;
    private float bonusUsado;
    private String formaPagamento;

    public PedidoCliente(int id) {
        this.id = id;
        this.itensPedido = new ArrayList<ItemPedido>();
        this.statusPedido = "Aberto";
        this.valorTotal = 0.0f;
    }

    public int getId() { 
        return id; 
    }

    public void setId(int id) {
        this.id = id; 
    }

    public ArrayList<ItemPedido> getItensPedido() { 
        return itensPedido; 
    }

    public String getStatusPedido() { 
        return statusPedido; 
    }

    public void setStatusPedido(String statusPedido) { 
        this.statusPedido = statusPedido; 
    }

    public float getValorTotal() { 
        return valorTotal; 
    }

    public float getBonusUsado() { 
        return bonusUsado; 
    }

    public void setBonusUsado(float bonusUsado) { 
        this.bonusUsado = bonusUsado; 
    }

    public String getFormaPagamento() { 
        return formaPagamento; 
    }

    public void setFormaPagamento(String formaPagamento) { 
        this.formaPagamento = formaPagamento; 
    }

    public void calcularTotal() {
        float soma = 0;
        for (ItemPedido ip : itensPedido) {
            soma += ip.getItem().getPreco() * ip.getQuantidade();
        }
        this.valorTotal = soma - bonusUsado;
    }

    public void fecharPedido() {
        this.statusPedido = "Fechado";
        calcularTotal();
        System.out.println("Pedido " + id + " fechado. Total: R$ " + valorTotal);
    }

    public void pagarPedido(String forma) {
        this.formaPagamento = forma;
        this.statusPedido = "Pago";
        System.out.println("Pagamento realizado via: " + forma);
    }

    public void adicionarItem(ItemPedido item) {
        this.itensPedido.add(item);
    }
}

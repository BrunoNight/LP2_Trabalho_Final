package modelo;

public class Mesa {
    private int id;
    private boolean ocupado;
    private Cliente clienteMesa;

    public Mesa() {
        this.ocupado = false;
        this.clienteMesa = null;
    }

    // Métodos de negócio mapeados no UML
    public void ocuparMesa() {
        this.ocupado = true;
    }

    public void liberarMesa() {
        this.ocupado = false;
        this.clienteMesa = null; 
    }

    public void acessarCardapio() {
        System.out.println("Acessando o cardápio da mesa: " + this.id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Cliente getClienteMesa() {
        return clienteMesa;
    }

    public void setClienteMesa(Cliente clienteMesa) {
        this.clienteMesa = clienteMesa;
    }
}
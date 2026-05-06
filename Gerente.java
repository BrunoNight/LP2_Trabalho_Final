import java.util.ArrayList;

public class Gerente
{
    private String nome, cpf, email,senha;
    private Cardapio cardapio;
    
    public Gerente(String nome, String cpf, String email, String senha)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public void cadastrarCardapio(itemComida item)
    {
        cardapio.getListaComida().add(item);
    }
    public void cadastrarCardapio(itemBebida item)
    {
        cardapio.getlistaBebida().add(item);
    }
    
    public ArrayList<itemCardapio> getCardapio(){
        return cardapio;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
}

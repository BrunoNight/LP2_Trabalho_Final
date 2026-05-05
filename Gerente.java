import java.util.ArrayList;
//sujeito a alterações devido ao cardapio
public class Gerente
{
    private String nome, cpf, email,senha;
    private ArrayList<itemCardapio> cardapio = new Arraylist<itemCardapio>();
    
    public Gerente(String nome, String cpf, String email, String senha)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public void cadastrarCardápio(itemCardapio item)
    {
        cardapio.add(item);
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

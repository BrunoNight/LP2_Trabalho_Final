public class Cliente
{
    private String nome;
    private String cpf;
    private String email;
    private float bonusAcumulado;

    public Cliente(String nome, String cpf, String email)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.bonusAcumulado = 0;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getEmail(){
        return this.email;
    }
    public float getBonusAcumulado(){
        return this.bonusAcumulado;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setBonusAcumulado(float bonusAcumulado){
        this.bonusAcumulado = bonusAcumulado;
    }
}
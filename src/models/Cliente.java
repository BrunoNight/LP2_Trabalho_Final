package modelo;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private float bonusAcumulado;
    private Conta conta; 

    public Cliente() {
        this.bonusAcumulado = 0.0f;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getBonusAcumulado() {
        return bonusAcumulado;
    }

    public void setBonusAcumulado(float bonusAcumulado) {
        this.bonusAcumulado = bonusAcumulado;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
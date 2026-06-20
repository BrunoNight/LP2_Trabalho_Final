public abstract class ItemCardapio {
	protected String nome;
	protected float preco;

	public ItemCardapio(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public void atualizarPreco(float novoPreco) {
		if(novoPreco <= 0) {
			return;
		}
		
		this.preco = novoPreco;
	}

	public String getNome() {
		return this.nome;
	}

	public float getPreco() {
		return this.preco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

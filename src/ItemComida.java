public class ItemComida extends ItemCardapio {
	private String descricao;
	private String ingredientes;

	public ItemComida(String nome, float preco, String tipo, String descricao, String ingredientes) {
		super(nome, preco);

		this.descricao = descricao;
		this.ingredientes = ingredientes;
	}

	@Override
	public String exibirDetalhes() {
		return "Nome: "+this.nome+"\nPreco: "+this.preco+"\nDescricao: "+this.descricao+"\nIngrediente: "+this.ingredientes;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIngredientes() {
		return this.ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}	
}

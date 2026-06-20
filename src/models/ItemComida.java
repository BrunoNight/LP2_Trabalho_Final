public class ItemComida extends ItemCardapio {
	private String descricao;
	private String ingredientes;

	public ItemComida(String nome, float preco, String tipo, String descricao, String ingredientes) {
		super(nome, preco);

		this.descricao = descricao;
		this.ingredientes = ingredientes;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void atualizarDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIngredientes() {
		return this.ingredientes;
	}

	public void atualizarIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}	
}

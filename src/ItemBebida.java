public class ItemBebida extends ItemCardapio {
	private String fornecedor;

	public ItemBebida(String nome, float preco, String fornecedor) {
		super(nome, preco);

		this.fornecedor = fornecedor;
	}

	@Override
	public String exibirDetalhes() {
		return "Nome: "+this.nome+"\nPreco: "+this.preco+"\nFornecedor: "+this.fornecedor;
	}

	public String getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
}

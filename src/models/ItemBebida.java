public class ItemBebida extends ItemCardapio {
	private String fornecedor;

	public ItemBebida(String nome, float preco, String fornecedor) {
		super(nome, preco);

		this.fornecedor = fornecedor;
	}

	public String getFornecedor() {
		return this.fornecedor;
	}

	public void atualizarFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
}

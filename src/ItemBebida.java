public class ItemBebida extends ItemCardapio {
	private String fornecedorBebida;

	public ItemBebida(String nomeItem, float precoItem, String tipoItem, String fornecedorBebida) {
		super(nomeItem, precoItem, tipoItem);

		this.fornecedorBebida = fornecedorBebida;
	}

	public String getFornecedorBebida() {
		return this.fornecedorBebida;
	}

	public void setFornecedorBebida(String fornecedorBebida) {
		this.fornecedorBebida = fornecedorBebida;
	}
}

public class ItemCardapio {
	private String nomeItem;
	private float precoItem;
	private String tipoItem;

	public ItemCardapio(String nomeItem, float precoItem, String tipoItem) {
		this.nomeItem = nomeItem;
		this.precoItem = precoItem;
		this.tipoItem = tipoItem;
	}

	public void atualizarPrecoItem(float novoPreco) {
		if(novoPreco <= 0) {
			return;
		}
		
		this.precoItem = novoPreco;
	}

	public String nomeItem() {
		return this.nomeItem;
	}

	public float precoItem() {
		return this.precoItem;
	}

	public String tipoItem() {
		return this.tipoItem;
	}

	public void nomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public void tipoItem(String tipoItem) {
		this.tipoItem = tipoItem;
	}
}

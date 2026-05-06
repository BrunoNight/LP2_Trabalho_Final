public class ItemComida extends ItemCardapio {
	private String descricaoComida;
	private String ingredientesComida;

	public ItemComida(String nomeItem, float precoItem, String tipoItem, String descricaoComida, String ingredientesComida) {
		super(nomeItem, precoItem, tipoItem);

		this.ingredientesComida = ingredientesComida;
	}

	public String getDescricaoComida() {
		return this.descricaoComida;
	}

	public void setDescricaoComida(String descricaoComida) {
		this.descricaoComida = descricaoComida;
	}

	public String getIngredientesComida() {
		return this.ingredientesComida;
	}

	public void setIngredientesComida(String ingredientesComida) {
		this.ingredientesComida = ingredientesComida;
	}	
}

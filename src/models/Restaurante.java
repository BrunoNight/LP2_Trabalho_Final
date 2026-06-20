import java.util.ArrayList;
/**
 *
 * @author mirella
 */
public class Restaurante {
    private Gerente gerente;
    private Cozinha cozinha;
    private ArrayList<ItemCardapio> cardapio = new ArrayList<ItemCardapio>();
    private ArrayList<Mesa> mesas = new ArrayList<Mesa>();

    public Restaurante(Gerente gerente, Cozinha cozinha) {
        this.gerente = gerente;
        this.cozinha = cozinha;
    }

    public void cadastrarItemCardapio(ItemCardapio item) {
		if(item == null) {
			return;
		}
    	cardapio.add(item);
    }

    public void alterarNomeItemCardapio(String nome, ItemCardapio item) {
    	for(ItemCardapio itemCardapio : cardapio) {
    		if(itemCardapio.getNome().equals(nome)){
    			itemCardapio.setNome(item.getNome());
    			itemCardapio.atualizarPreco(item.getPreco());
    			
    			if(item instanceof ItemBebida) {
					ItemBebida itemBebida = (ItemBebida) itemCardapio;
					ItemBebida novoItemBebida = (ItemBebida) item;    	
								
    				itemBebida.atualizarFornecedor(novoItemBebida.getFornecedor());
    			} else {
	   				ItemComida comidaCardapio = (ItemComida) itemCardapio;
	   				ItemComida comidaNova = (ItemComida) item;
	   				                
	 				comidaCardapio.atualizarDescricao(comidaNova.getDescricao());
	 				comidaCardapio.atualizarIngredientes(comidaNova.getIngredientes());
    			}
    		}
    	}
    }

    public void alterarNomeItemCardapio(String nomeAntigo, String nomeNovo) {
    	for(ItemCardapio item : cardapio) {
    		if(item.getNome().equals(nomeAntigo)){
    			item.setNome(nomeNovo);
    		}
    	}
    }

    public void alterarPrecoItemCardapio(String nome, float precoNovo) {
       	for(ItemCardapio item : cardapio) {
       		if(item.getNome().equals(nome)){
       			item.atualizarPreco(precoNovo);
       		}
        }
    }

    public void alterarFornecedorItemCardapio(String nome, String fornecedorNovo) {
       	for(ItemCardapio item : cardapio) {
       		if(item.getNome().equals(nome)){
       			((ItemBebida) item).atualizarFornecedor(fornecedorNovo);
       		}
        }
    }	    

    public void alterarDescricaoItemCardapio(String nome, String descricaoNovo) {
       	for(ItemCardapio item : cardapio) {
       		if(item.getNome().equals(nome)){
       			((ItemComida) item).atualizarDescricao(descricaoNovo);
       		}
        }
    }

    public void alterarIngredientesItemCardapio(String nome, String ingredientesNovo) {
       	for(ItemCardapio item : cardapio) {
       		if(item.getNome().equals(nome)){
       			((ItemComida) item).atualizarIngredientes(ingredientesNovo);
       		}
        }
    }

    public void removerItemCardapio(String nome) {
		for(int i = 0; i < cardapio.size(); i++) {
	  		if(nome.equals(cardapio.get(i).getNome())) {
	  			cardapio.remove(i);
	  			break;
	  		}
	   	} 
    }

    public ItemCardapio consultarItemCardapio(String nome) { 
    	for(ItemCardapio item : cardapio) {
	   		if(item.getNome().equals(nome)){
	   			return item;
	   		}
    	}

    	return null;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Cozinha getCozinha() {
        return cozinha;
    }

    public void setCozinha(Cozinha cozinha) {
        this.cozinha = cozinha;
    }

    public ArrayList<ItemCardapio> getCardapio() {
        return cardapio;
    }

    public void setCardapio(ArrayList<ItemCardapio> cardapio) {
        this.cardapio = cardapio;
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }
    
}

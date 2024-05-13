package composite.padrao.projeto;

import java.util.List;

public class ProjetoComposite implements Item{
    private List<Item> itens;

    public ProjetoComposite(List<Item> itens){
        this.itens = itens;
    }

    public void addItem(Item item){
        this.itens.add(item);
    }

    @Override
    public double calcularPrecoFinal() {
        double precofinal = 0;
        for (Item item: itens) {
            precofinal += item.calcularPrecoFinal();
        }
        return precofinal;
    }
}

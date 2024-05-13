package composite.padrao.projeto;

import java.util.ArrayList;

public class Main {
    public static void main (String[]args){
        ProjetoComposite projeto = new ProjetoComposite(new ArrayList<Item>());
        projeto.addItem(new Produto("RAM 256G", 200));
        projeto.addItem(new Produto("RAM 512G", 300));
        projeto.addItem(new Produto("PLACA DE VÍDEO A4500", 2000));

        ProjetoComposite subprojeto = new ProjetoComposite(new ArrayList<Item>());
        subprojeto.addItem(new Produto("RAM 1024G", 500));
        subprojeto.addItem(new Produto("RAM 1024G", 500));
        subprojeto.addItem(new Produto("PLACA DE VÍDEO AB350", 4000));

        projeto.addItem(subprojeto);

        ProjetoComposite subprojeto2 = new ProjetoComposite(new ArrayList<Item>());
        subprojeto2.addItem(new Produto("CABO 500M", 1500));
        subprojeto2.addItem(new Produto("CONECTORES", 1400));

        projeto.addItem(subprojeto2);

        System.out.println("TOTAL DO PROJETO= " +projeto.calcularPrecoFinal());
    }
}

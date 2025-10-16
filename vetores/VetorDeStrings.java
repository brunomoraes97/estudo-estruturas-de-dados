public class VetorDeStrings {

    private String[] elementos;
    private Integer quantidadeDeElementos;

    public VetorDeStrings(int capacidade) {
        this.elementos = new String[capacidade];
        this.quantidadeDeElementos = 0;
    }

    public boolean adicionaElemento(String elemento) {

        if (this.quantidadeDeElementos < this.elementos.length) {

            this.elementos[quantidadeDeElementos] = elemento;
            this.quantidadeDeElementos++;
            return true;

        }

        return false;

    }

    public void adicionaElementoMetodoRuim(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }

}
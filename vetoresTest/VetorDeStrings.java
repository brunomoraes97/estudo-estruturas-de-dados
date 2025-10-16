public class VetorDeStrings {

    private String[] elementos;
    private int tamanho;

    public VetorDeStrings(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adicionaElementoEmQualquerPosicao(String elemento, int posicao) throws Exception {
    
        // Verifica se a posição é possível
        if (!(posicao >= 0 && posicao < this.elementos.length)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            // Move todo mundo para a direita
            // Isto é, para uma posição adiante
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
        
        return true;

    }

    public boolean adicionaElemento(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public String getElementoByPosicao(int posicao) throws Exception {
        if (posicao >= 0 && posicao < this.elementos.length) {
            return this.elementos[posicao];
        }
        throw new IllegalArgumentException("Posição inválida.");
    }

    public int buscaPosicaoByElemento(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }

        }
        return -1; // since it's not Integer, but int
    }

    public void imprimeElementos() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.print(this.elementos[i] + " > ");
        }
    }

    public void imprimeListaCompleta() {
        for (int i = 0; i < this.elementos.length; i++) {
            System.out.print(this.elementos[i] + " > ");
        }
    }

}

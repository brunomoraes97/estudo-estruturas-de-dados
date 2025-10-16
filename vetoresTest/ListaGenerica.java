public class ListaGenerica<T> {

    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public ListaGenerica(int capacidade, Class<T> T) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean removeElementoEmQualquerPosicao(int posicao) {

        if (!(posicao >= 0 && posicao < this.elementos.length)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
        return true;
    }

    public boolean adicionaElementoEmQualquerPosicao(Object elemento, int posicao) throws Exception {

        if (this.tamanho == this.elementos.length) {
            this.aumentarCapacidade();
        }

        // Verifica se a posição é possível
        if (!(posicao >= 0 && posicao < this.elementos.length)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            // Move todo mundo para a direita
            // Isto é, para uma posição adiante
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = (T) elemento;
        this.tamanho++;

        return true;

    }

    public void aumentarCapacidade() {

        Object[] novosElementos = new Object[this.elementos.length * 2];

        for (int i = 0; i < this.elementos.length; i++) {
            novosElementos[i] = this.elementos[i];
        }

        this.elementos = (T[]) novosElementos;

    }

    public boolean adicionaElemento(Object elemento) {

        if (this.tamanho == this.elementos.length) {
            this.aumentarCapacidade();
        }

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = (T) elemento;
            this.tamanho++;
            return true;
        }

        return false;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public Object getElementoByPosicao(int posicao) throws Exception {
        if (posicao >= 0 && posicao < this.elementos.length) {
            return this.elementos[posicao];
        }
        throw new IllegalArgumentException("Posição inválida.");
    }

    public int buscaPosicaoByElemento(Object elemento) {
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

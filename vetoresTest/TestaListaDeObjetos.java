public class TestaListaDeObjetos {
    public static void main(String[] args) {
        ListaDeObjetos lista = new ListaDeObjetos(2);
        Contato c1 = new Contato(
            "Contato 1",
            "3275-5778",
            "um@contato.com.br");

        Contato c2 = new Contato(
            "Contato 2",
            "0800-2008-100",
            "outro@contato.com.br");

        lista.adicionaElemento(c1);
        lista.adicionaElemento(c2);

        System.out.println("Tamanho = " + lista.getTamanho());

        lista.imprimeElementos();
        System.out.println();
        lista.imprimeListaCompleta();
    }
}

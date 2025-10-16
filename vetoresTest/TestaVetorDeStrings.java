public class TestaVetorDeStrings {

    public static void main(String[] args) throws Exception {
        VetorDeStrings vetor = new VetorDeStrings(5);
        vetor.adicionaElemento("olá!");
        vetor.adicionaElemento("oi!");
        vetor.adicionaElemento("ei!");
        vetor.adicionaElemento("ow!");

        // vetor.imprimeElementos();
        // System.out.println();
        // vetor.imprimeListaCompleta();

        for (int i = 0; i < 10; i++) {
            System.out.println(vetor.getElementoByPosicao(i));
        }


    }
}

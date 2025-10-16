public class TestaVetorDeStrings {

    public static void main(String[] args) throws Exception {
        VetorDeStrings vetor = new VetorDeStrings(5);
        vetor.adicionaElemento("olá!");
        vetor.adicionaElemento("oi!");
        vetor.adicionaElemento("ei!");
        vetor.adicionaElemento("ow!");

        vetor.imprimeListaCompleta();
        System.out.println();

        // vetor.imprimeElementos();
        // System.out.println();
        // vetor.imprimeListaCompleta();

        /*
        for (int i = 0; i < 10; i++) {
            System.out.println(vetor.getElementoByPosicao(i));
        }
        

        System.out.println(vetor.buscaPosicaoByElemento("olá!"));
        System.out.println(vetor.buscaPosicaoByElemento("oi!"));
        System.out.println(vetor.buscaPosicaoByElemento("aôba!"));

        */

        vetor.adicionaElementoEmQualquerPosicao("epa", 1);

        vetor.imprimeListaCompleta();
    }
}

public class TestaVetorDeStrings {

    private static void verificaSeDeuCerto(boolean resultado, int posicao) {
        System.out.println("Posição: " + posicao);
        if (resultado == true) System.out.println("deu certo!");
        else System.out.println("não deu certo!");
    }
    public static void main(String[] args) {
        VetorDeStrings vetor = new VetorDeStrings(2);
        boolean resultado1 = vetor.adicionaElemento("olá");
        verificaSeDeuCerto(resultado1, 1);
        boolean resultado2 = vetor.adicionaElemento("oi!");
        verificaSeDeuCerto(resultado2, 2);
        boolean resultado3 = vetor.adicionaElemento("ei!");
        verificaSeDeuCerto(resultado3, 3);
                boolean resultado4 = vetor.adicionaElemento("ow!");
        verificaSeDeuCerto(resultado4, 4);

    }
}

public class BubbleSort {

    BubbleSort() {
        //Lendo as entradas.
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor");
        int tam;
        tam = ler.nextInt();
        int vet1[] = new int[tam];
        //Lendo os dados do vetor.
        for (int i = 0; i < tam; i++) {
            System.out.println("Digite o valor:");
            vet1[i] = ler.nextInt();
        }
        //Fechando o  teclado.
        ler.close();
        //Inicializando a variavel auxiliar.
        int aux = 0;
        //Fazendo a ordenação. 
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam - 1; j++) {
                if (vet1[j] > vet1[j + 1]) {
                    aux = vet1[j];
                    vet1[j] = vet1[j + 1];
                    vet1[j + 1] = aux;
                }
            }
        }
        //Mostrando o vetor ordenado na tela.
        System.out.println("\nVetor Ordenado");
        for (int i = 0; i < tam; i++) {
            System.out.println(vet1[i]);
        }
    }

    public static void main(String[] args) {
        //Instanciando a classe.
        //Para o metodo construtor rodar.
        BubbleSort bubble = new BubbleSort();
    }
}

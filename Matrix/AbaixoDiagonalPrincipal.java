public class AbaixoDiagonalPrincipal
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        String operacao;
        int i, j, soma = 0, numeros = 0;
        operacao = scan.next();
        int quantidade = scan.nextInt();
        
        int mat[][] = new int[quantidade][quantidade];
        
        for(i=0; i<quantidade; i++){
            for(j=0; j<quantidade; j++){
                mat[i][j] = scan.nextInt();
            }
        }
        
        for(i=0; i<quantidade; i++){
            for(j=0; j<i; j++){
                soma += mat[i][j];
                numeros++;
            }
        }
        
        if(operacao.equals("S"))
        {
            System.out.printf("%.1f\n", (float)soma);
        }
        else
        {
            System.out.printf("%.1f\n", ((float)soma/numeros));
        }
        
    }
}
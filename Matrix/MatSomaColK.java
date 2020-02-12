public class MatSomaColK
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int quantidade = scan.nextInt();
        int mat[][] = new int[quantidade][quantidade];
        int i, j, coluna, soma = 0;
        
        coluna = scan.nextInt();
        
        for(i=0; i<quantidade; i++){
            for(j=0; j<quantidade; j++){
                mat[i][j] = scan.nextInt();
            }
        }
        
        for(i=0; i<quantidade; i++){
            soma += mat[i][coluna];
        }
        
        System.out.println(soma);
        
    }
}